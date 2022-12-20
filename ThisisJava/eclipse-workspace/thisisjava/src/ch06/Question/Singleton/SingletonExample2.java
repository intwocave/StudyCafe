package ch06.Question.Singleton;

public class SingletonExample2 {
	public static void main() {
		Singleton2 st1 = Singleton2.getInstance();
		Singleton2 st2 = Singleton2.getInstance();
		
		if (st1 == st2) {
			System.out.println("st1과 st2 객체의 주소는 같습니다.");
		} else {
			System.out.println("st1과 st2 객체의 주소는 다릅니다.");
		}
	}
}
