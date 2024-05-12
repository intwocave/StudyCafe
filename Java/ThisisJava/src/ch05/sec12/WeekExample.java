/*
package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Calendar cal = new Calendar.getInstance();

        Week today = null;

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1 -> today = Week.SUNDAY;
            case 2 -> today = Week.MONDAY;
            case 3 -> today = Week.TUSEDAY;
            case 4 -> today = Week.WEDNESDAY;
            case 5 -> today = Week.THURSDAY;
            case 6 -> today = Week.FRIDAY;
            case 7 -> today = Week.SATURDAY;
        }

        if(today == Week.SUNDAY) System.out.println("일요일에는 축구를 합니다.");
        else System.out.println("자바 공부합니다");
    }
}
*/