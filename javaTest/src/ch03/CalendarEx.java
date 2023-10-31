package ch03;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int dateOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String[] weekArr = {"일","월","화","수","목","금","토"};
		String dayOfWeekStr = weekArr[dateOfWeek-1];
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String dayStr = year + "년 " +month + "월 " + date + "일 " + dayOfWeekStr + "요일 ";
		System.out.println(dayStr);
		String timeStr = hour  + "시 " + minute + "분 " + second + "초 ";
		System.out.println(timeStr);
	}
}
