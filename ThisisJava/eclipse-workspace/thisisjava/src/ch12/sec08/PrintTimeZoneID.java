package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] timeZoneID = TimeZone.getAvailableIDs();
		
		for(String id : timeZoneID) {
			System.out.println(id);
		}
	}
}
