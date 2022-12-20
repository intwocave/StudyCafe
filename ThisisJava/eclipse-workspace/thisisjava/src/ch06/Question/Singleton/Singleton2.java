package ch06.Question.Singleton;

public class Singleton2 {
	private static Singleton2 st = new Singleton2();
	
	private Singleton2() {};
	
	public static Singleton2 getInstance() {
		return st;
	}
}
