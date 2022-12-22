package ch09.sec02.exam01;

public class A {
	class B {
		String sayHello = "Hello. ClassClass!";
		
		B() {
			System.out.println("B의 생성자를 호출합니다.");
		}
		
		void sayHello() {
			System.out.println(sayHello);
		}
		
		static void sayStatic() {
			System.out.println("sayStatic");
		}
	}
	
	B b = new B();
	
	A() {
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}
	
	void useB() {
		B b = new B();
		b.sayHello();
		b.sayHello = "ClassClass Hello!";
		b.sayHello();
	}
}
