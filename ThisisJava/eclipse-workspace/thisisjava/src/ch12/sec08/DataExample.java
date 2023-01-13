package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.*;

public class DataExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(simpleDate.format(now));
	}
}
