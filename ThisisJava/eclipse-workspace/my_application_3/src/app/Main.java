package app;

import pack1.A;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		pack2.B b = new pack2.B();
		b.method();
		
		pack3.C c = new C();
		c.method();
	}
}
