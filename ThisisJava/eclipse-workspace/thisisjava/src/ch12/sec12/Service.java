package ch12.sec12;

public class Service {
	@PrintAnnotation("-")
	void method1() {
		System.out.println("실행 내용 1");
	}
	
	@PrintAnnotation("*")
	void method2() {
		System.out.println("실행 내용 2");
	}

	@PrintAnnotation("#")
	void method3() {
		System.out.println("실행 내용 3");
	}
}
