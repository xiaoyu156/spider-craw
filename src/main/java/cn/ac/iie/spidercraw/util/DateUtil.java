package cn.ac.iie.spidercraw.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
	
	/**
	 * 获取当前时间
	 * @param formate  时间格式
	 * @return
	 */
	public static String getCurrentDateStr(String formate) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		String dateNowStr = sdf.format(d);
		return dateNowStr;
	}
	
    /**
     * 获取前count或者后count年月日
     * @param formate  返回时间格式
     * @param count    带符号的时间调整值
     * @param type     调整的时间类型
     * @return
     */
	@SuppressWarnings("static-access")
	public static String getPreviousOrAfterDate(String formate,int count,String type) {
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		if("year".equals(type)) {
			calendar.add(calendar.YEAR, count);
		}
		if("month".equals(type)) {
			calendar.add(calendar.MONTH, count);
		}
		if("day".equals(type)) {
			calendar.add(calendar.DATE, count);
		}
		date = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(formate);
		String dateString = formatter.format(date);
		return dateString;
	}
	
	public static void main(String[] args) {
		System.out.println(getPreviousOrAfterDate("yyyy-MM-dd HH:mm:ss", -34,"month"));
	}
	
}
