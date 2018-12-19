package com.rpym.univweb.tool.timer;

import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.rpym.univweb.utils.TimeUtil;

public class NoticePublishTimer extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new Date() + "执行了....");
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		try {
			timer.schedule(new NoticePublishTimer(), TimeUtil.df.get().parse("2018-12-20 00:16:00"));
			//System.out.println(new Date() + "执行完了，停止");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

