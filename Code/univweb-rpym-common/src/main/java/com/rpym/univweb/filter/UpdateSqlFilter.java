package com.rpym.univweb.filter;

import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Repository;

import com.rpym.univweb.common.CommonBase;
import com.rpym.univweb.constants.CommonConst;
import com.rpym.univweb.dao.SysSqlLogMapper;
import com.rpym.univweb.entity.SysSqlLog;
import com.rpym.univweb.utils.SpringContextUtils;

import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.update.Update;

@Repository
@Intercepts(@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}))
public class UpdateSqlFilter extends CommonBase implements Interceptor {

	public Object intercept(Invocation invocation) throws Throwable {
		final Object[] args = invocation.getArgs();
		//获取原始的ms
        MappedStatement ms = (MappedStatement) args[0];
        Object parameterObject = args[1];
		BoundSql boundSql = ms.getBoundSql(parameterObject);
		String sql = boundSql.getSql().toLowerCase().trim();
		CCJSqlParserManager parser = new CCJSqlParserManager();
		Statement stmt = parser.parse(new StringReader(sql));
		Object obj = boundSql.getParameterObject();
		Class<? extends Object> cls = obj.getClass();
		Method method = null;
		if(stmt instanceof Update) {
			try {
				method = cls.getMethod("setLastmodificationtime", Date.class);
				if(method != null) {
					method.invoke(obj, new Date());
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
			
			try {
				method = cls.getMethod("setLastmodifieruserid", Long.class);
				Long userId = 1L;//getSessionUserid();
				if(method != null && userId != null) {
					method.invoke(obj, userId);
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
		if(stmt instanceof Insert) {
			try {
				method = cls.getMethod("setCreationtime", Date.class);
				if(method != null) {
					method.invoke(obj, new Date());
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
			
			try {
				method = cls.getMethod("setCreatoruserid", Long.class);
				Long userId = 1L;//getSessionUserid();
				if(method != null && userId != null) {
					method.invoke(obj, userId);
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
		
		// 记录操作日志
		sqlLog(stmt, boundSql, parameterObject);
        
		return invocation.proceed();
	}
	
	/**
	 * 记录操作日志
	 * @param boundSql
	 * @param parameterObject
	 */
	private void sqlLog(Statement stmt, BoundSql boundSql, Object parameterObject) {
		try {

			SysSqlLogMapper sqlLogDao = (SysSqlLogMapper)SpringContextUtils.getBean("sysSqlLogMapper");
			String tbName = null;
			String sql = boundSql.getSql();
			
			
			// 更新语句处理
			if (stmt instanceof Update) {
				Update statement = (Update) stmt;
				tbName = statement.getTables().get(0).getName();
			}
			// 更新语句处理
			if (stmt instanceof Delete) {
				Delete statement = (Delete) stmt;
				tbName = statement.getTable().getName();
			}
			// 插入语句处理
			if (stmt instanceof Insert) {
			    Insert statement = (Insert) stmt;
			    tbName = statement.getTable().getName();
			}
			
			SysSqlLog sqlLog = new SysSqlLog();
			sqlLog.setSqltext(sql);
			sqlLog.setParams(CommonConst.GSON.toJson(boundSql.getParameterObject()));
			sqlLog.setTablename(tbName);
			sqlLog.setCreationtime(new Date());
			sqlLog.setCreatoruserid(1L);
			sqlLogDao.insertSelective(sqlLog);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object plugin(Object target) {
		if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
	}
	
	public void setProperties(Properties properties) {
		
	}
}