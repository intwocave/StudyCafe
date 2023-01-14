package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regex = "(02|010)-\\d{3,4}-\\d{4}";
		String phoneNum = "010-1234-5678";
		
		Boolean result = Pattern.matches(regex, phoneNum);
		if(result) {
			System.out.println("정규식과 일치합니다.");	
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String mailAddr = "google@gmail.com";
		
		result = Pattern.matches(regex, mailAddr);
		if(result) {
			System.out.println("정규식과 일치합니다.");	
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
