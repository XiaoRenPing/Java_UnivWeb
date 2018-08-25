package com.rpym.univweb.constants;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CommonConst {


	/**
	 * GSON格式化工具
	 */
	public static Gson GSON = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();
	
	/**
	 * 用于解析json格式 数字类型中带有空串
	 */
	/*public static Gson NUMBER_EMPTY_GSON = new GsonBuilder()
	        .registerTypeAdapter(Integer.class, new IntegerDefault0Adapter())
	        .registerTypeAdapter(Double.class, new DoubleDefault0Adapter())
	        .registerTypeAdapter(Long.class, new LongDefault0Adapter())
	        .registerTypeAdapter(BigDecimal.class, new BigDecimalDefault0Adapter())
	        .create();*/
	
	/**
	 * 数字0
	 */
	public static int NUM_0 = 0;
	
	/**
	 * 数字1
	 */
	public static int NUM_1 = 1;
	
	/**
	 * 数字1
	 */
	public static int NUM_2 = 2;
	
	/**
	 * 默认分页大小
	 */
	public static int NUM_10 = 10;
	
	/**
	 * 编码
	 */
	public static String UTF8 = "UTF-8";
	
	/**
	 * 请求时间
	 */
	public static String REQUEST_DATE_TIME = "request_date_time";
	
	/**
	 * 编码
	 */
	public static String CONTENT_TYPE_UTF8 = "text/html;charset=UTF-8";
	
	/**
	 * token
	 */
	public static String TOKEN = "token";
	
	/**
	 * token delete
	 */
	public static String DELETE = "delete";
	
	/**
	 * user
	 */
	public static String USER = "user";
	
	/**
	 * websocket
	 */
	public static String WEB_SOCKET = "websocket";
	
	
	/**
	 * 验证码前缀
	 */
	public static String IDENTIFY_CODE = "identify_code";
	
	/**
	 * 下划线
	 */
	public static String UNDER_LINE = "_";
	
	/**
	 * 问号
	 */
	public static String QUESTION  = "?";
	
	/**
	 * 等号
	 */
	public static String EQUEL = "=";
	
	/**
	 * 点
	 */
	public static String POINT = ".";
	
	/**
	 * 分隔符-逗号,
	 */
	public static String SPLIT = ",";
	
	/**
	 * TRIGGER_GROUP_NAME
	 */
	public static String TRIGGER_GROUP_NAME = "TRIGGER_GROUP";
	
	/**
	 * JOB_GROUP_NAME
	 */
	public static String JOB_GROUP_NAME = "JOB_GROUP";

	/**
	 * 文件上传路径
	 */
	public static String FILEUPLOADPATH_SETTING_NAME = "file_upload_path";
	
	/**
	 * 行业分类
	 */
	public static String INDUSTRY_CATEGORY = "industry_category";
	
	
	public static final String CONTRACT_GOODS_TYPE = "ContractGoodsType";
	
	/**
	 * 省份
	 */
	public static String PROVINCES = "provinces";
	
	/**
	 * 城市
	 */
	public static String CITYS = "citys";
	
	/**
	 * 银行
	 */
	public static String BANKS = "banks";
	
	/**
	 * 公司规模
	 */
	public static String LNSIZE = "lnsize";
	
	/**
	 * 资产类型
	 */
	public static String ASSET_CATEGORY = "asset_category";
	
	/**
	 * 我的TK单状态
	 */
	public static final String MYORDERS_STATUS = "myOrders_status";
	
	/**
	 * 投资期限
	 */
	public static String INVEST_TERM = "invest_term";
	
	/**
	 * 文件服务器地址
	 */
	public static String TEEKING_UPLOAD_URL = "teeking_upload_url";
	
	/**
	 * 区块链服务地址
	 */
	public static String BLOCKCHAIN_SERVICE_URL = "blockchain_service_url";
	
	/**
	 * 区块链参数组织
	 */
	public static String BLOCKCHAIN_PARAM_ORG = "blockchain_param_org";
	
	/**
	 * 合同模板ID
	 */
	public static String PURCHASE_ELECT_CONTRACT_TEMTLATEID = "purchase_elect_contract_temtlateid";

	/**
	 * 融资服务费
	 */
	public static final String ASSET_SERVICE_RATE = "asset_service_rate";
	
	/**
	 * 融资服务条款
	 */
	public static final String ASSET_SERVICE_ITEM = "asset_service_item";
	
	
	/**
	 * key
	 */
	public static final String KEY = "key";
	
	/**
	 * key
	 */
	public static final String HASH = "hash";
	
	/**
	 * key
	 */
	public static final String ORG = "org";
	
	/**
	 * USERID
	 */
	public static final String USERID = "userId";
	
	
	/**
	 * 待办类型
	 */
	public static final String TODO_TYPE = "todo_type";
	
	/**
	 * 百分号
	 */
	public static final String PERCENT = "%";
	
	/**
	 * 反斜杠
	 */
	public static final String BACK_SLANT = "/";
	
	/**
	 * 匹配中文正则表达式
	 */
	public static final String REGEX_CHINA = "[\\u4e00-\\u9fa5]";
	
	/**
	 * yyyy/MM/dd
	 */
	public static final String DATE_PATH_FMT_STR = "yyyy/MM/dd";
	
	/**
	 * yyyy-MM-dd
	 */
	public static final String DATE_FMT_STR = "yyyy-MM-dd";
	
	/**
	 * 日期格式化
	 */
	public static final SimpleDateFormat FMT_DATE = new SimpleDateFormat(DATE_FMT_STR);
	
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String DATE_TIME_FMT_STR = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * yyyyMMdd
	 */
	public static final String DATE_FMT_SHORT_STR = "yyyyMMdd";
	
	
	/**
	 * 简单格式日期类型
	 */
	public static final SimpleDateFormat DATE_FMT_SHORT = new SimpleDateFormat(DATE_FMT_STR, Locale.CHINA);
    
	/**
	 * 长格式日期类型
	 */
	public static final SimpleDateFormat DATE_TIME_FMT = new SimpleDateFormat(DATE_TIME_FMT_STR, Locale.CHINA); ;
 
	/**
	 * /files/
	 */
	public static final String FILES = "/files/";
	
	/**
	 * PDFJS_VIEWER_CONTEXT
	 */
	public static final String PDFJS_VIEWER_CONTEXT = "/pdfjs/web/viewer.html?file=";
	
	/**
	 * .docx
	 */
	public static final String DOCX = ".docx";
	
	/**
	 * .docx
	 */
	public static final String DOC = ".doc";
	
	/**
	 * .pdf
	 */
	public static final String PDF = ".pdf";
	
	/**
	 * 生成合同的接口
	 */
	public static final String GENCONTRACT_CONTEXT = "/files/genContract";
	
	/**
	 * 上传交车照片接口
	 */
	public static final String GENCONTRACT_DELIEVERIMAGE = "/files/genDeliverimage";
	
	/**
	 * 上传附件（大卖车）
	 */
	public static final String GENACCESSORYS = "/files/genAccessorys";
	
	/**
	 * 生成pdf
	 */
	public static final String GENCONTRACT_TEMPLATE_CONTEXT = "/files/genContractTemplate/";
	
	/**
	 * 下载pdf
	 */
	public static final String DOWNLOAD_PDF = "/files/downloadPdf/";
	
	/**
	 * 电子合同签署成功后回调地址
	 */
	public static final String ELECTCONTRACTS_CALLBACK = "/electcontracts/callback";
	
	/**
	 * 上传合同接口
	 */
	public static final String UPLOADDOCUMENT_CONTEXT = "/files/uploadDocument";
	
	/**
	 * 合同类型
	 */
	public static final String CONTRACT_TYPE = "contract_type";
	
	/**
	 * 合同标题
	 */
	public static final String CONTRACT_TITLE = "购买资产合同";
	
	/**
	 * 字符集ISO-8859-1
	 */
	public static final String CHARSET_ISO88591 = "ISO-8859-1";
	
	/**
	 * 字符集UTF-8
	 */
	public static final String CHARSET_UTF8 = "UTF-8";
	
	/**
	 * 字符集gbk
	 */
	public static final String CHARSET_GBK = "gbk";
	
	/**
	 * 法大大 结果
	 */
	public static final String RESULT = "result";
	
	/**
	 * 法大大 结果
	 */
	public static final String MSG = "msg";
	
	/**
	 * 法大大成功 success
	 */
	public static final String SUCCESS = "success";
	
	/**
	 * 法大大状态码    0待签署，3000（签章成功）3001(签章失败)
	 */
	public static final String SIGN_SUCCESS = "3000";
	
	/**
	 * 法大大成功 CUSTOMER_ID
	 */
	public static final String CUSTOMER_ID = "customer_id";
	
	/**
	 * 法大大data 节点
	 */
	public static final String DATA = "data";
	
	/**
	 * 购买资产甲方签署关键字定位
	 */
	public static String PURCHASE_ELECT_CONTRACT_FIRST_SIGN_KEYWORD = "purchase_elect_contract_first_sign_keyword";
	
	/**
	 * 购买资产乙方签署关键字定位
	 */
	public static String PURCHASE_ELECT_CONTRACT_SECOND_SIGN_KEYWORD = "purchase_elect_contract_second_sign_keyword";
	
	/**
	 * teeking_api_url
	 */
	public static String TEEKING_API_URL = "teeking_api_url";
	
	/**
	 * enable_user_register_sms_validatecode
	 */
	public static String ENABLE_USER_REGISTER_SMS_VALIDATECODE = "enable_user_register_sms_validatecode";
	
	/**
	 * 合同结算方式
	 */
	public static final String CONTRACT_SELLTE_TYPE = "ContractSellteType";
	
	/**
	 * 超管
	 */
	public static final String SUPER_ADMIN= "superadmin";
	
	/**
	 * 菜单标识
	 */
	public static final String MUNUS_CODE= "menus";
	
	/**
	 * 还款状态
	 */
	public static final String REPAY_STATUS = "repaystatus";
	/**
	 * 购物车资产数量限制
	 */
	public static final String ASSET_CART_ITEMS_LIMIT = "asset_cart_item_limit";
	
	/**
	 * 开单到期前多少天锁定
	 */
	public static final String LOCK_BEFORE_DAYS = "lock_before_days";
	
	/**
	 * 付息兑付提前多少天产生代办提醒
	 */
	public static final String REFUND_BEFORE_DAYS = "refund_before_days";
	
	/**
	 * 企业角色类型
	 */
	public static final String ENTERPRISE_ROLETYPE = "enterprise_roletype";
	
	/**
	 * 消息模板
	 */
	public static final String NOTIFICATION_TEMPLATE = "message_notify_template";
	
	/**
	 * 到期结算提前都少天提醒
	 */
	public static final String DUEDATE_BEFORE_DAYS = "duedate_before_days";
	
	/**
	 * 区块链是否启用
	 */
	public static final String BLOCKCHAIN_ISENABLE = "blockchain_enable";
	
	/**
	 * message结果
	 */
	public static final String MESSAGE = "message";
	
	/**
	 * POST
	 */
	public static final String POST = "POST";
	
	/**
	 * GET
	 */
	public static final String GET = "GET";
	/**
	 * integer最大能输入的值
	 */
	public static final int MAX_INTEGER = Integer.MAX_VALUE; 
	/**
	 * integer最小能输入的值
	 */
	public static final int MIN_INTEGER = 1;
	/**
	 * LONG最大能输入的值
	 */
	public static final long MAX_LONG = Long.MAX_VALUE;
	
	/**
	 * LONG最小能输入的值
	 */
	public static final long MIN_LONG = 1L;
	/**
	 * BigDecimal最大能输入的值
	 */
	public static final long MAX_BIGDECIMAL = 999999999999999999L;
	
	/**
	 * BigDecimal最小能输入的值
	 */
	public static final long MIN_BIGDECIMAL = 1L;
	
	/**
	 * 最小投资金额
	 */
	public static final long MIN_BUY_AMOUNT_LIMIT = 0;
	
}