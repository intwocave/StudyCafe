package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year, month, day, hour, minute, second;
        int week = now.get(Calendar.DAY_OF_WEEK);

        String weekday = switch(week) {
            case Calendar.SUNDAY -> "일";
            case Calendar.MONDAY -> "월";
            case Calendar.TUESDAY -> "화";
            case Calendar.WEDNESDAY -> "수";
            case Calendar.THURSDAY -> "목";
            case Calendar.FRIDAY -> "금";
            case Calendar.SATURDAY -> "토";
            default -> throw new IllegalStateException("Unexpected value: " + week);
        };

        year = now.get(Calendar.YEAR);
        month = now.get(Calendar.MONTH);
        day = now.get(Calendar.DAY_OF_MONTH);
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);

        System.out.printf(year + "년 " + month + "월 " + day + "일 " + weekday + "요일\n"
                + hour + "시 " + minute + "분 " + second + "초\n");
    }
}
