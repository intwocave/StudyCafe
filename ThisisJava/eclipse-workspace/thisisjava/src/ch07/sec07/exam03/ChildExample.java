package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = c;
		
		p.field = "Hello world";
		p.method();
		
		// p.field2 = "world";
		// p.method2();
		
		Child c2 = (Child) p;
		System.out.println(p.field);
		c2.method();
		
		c2.field2 = "world";
		c2.method2();
	}
}
