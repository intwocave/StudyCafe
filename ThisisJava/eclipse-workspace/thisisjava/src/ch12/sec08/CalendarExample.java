package ch12.sec08;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.WEEK_OF_MONTH);
		int amPm  = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		String strWeek;
		switch(week) {
		case Calendar.MONDAY: strWeek = "월요일"; break;
		case Calendar.TUESDAY: strWeek = "화요일"; break;
		case Calendar.WEDNESDAY: strWeek = "수요일"; break;
		case Calendar.THURSDAY: strWeek = "목요일"; break;
		case Calendar.FRIDAY: strWeek = "금요일"; break;
		case Calendar.SATURDAY: strWeek = "토요일"; break;
		//case Calendar.SUNDAY: strWeek = "일요일"; break;
		default: strWeek = "일요일";
		}
		
		String strAmpm;
		if(amPm == Calendar.AM) {
			strAmpm = "오전";
		} else {
			strAmpm = "오후";
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + strWeek);
		System.out.println(strAmpm + " " + hour + "시 " + minute + "분 " + second + "초");
	}
}
