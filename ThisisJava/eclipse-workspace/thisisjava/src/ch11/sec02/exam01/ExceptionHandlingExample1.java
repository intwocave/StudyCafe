package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLeng(String data) {
		System.out.println("문자열 수: " + data.length());
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("프로그램 시작");
			printLeng("ThisIsJava");
			printLeng(null);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
