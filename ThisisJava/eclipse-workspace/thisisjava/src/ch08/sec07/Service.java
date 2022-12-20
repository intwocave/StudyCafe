package ch08.sec07;

public interface Service {
	default void defMethod1() {
		System.out.println("defMethod1 called");
		defMethod0();
	}
	
	default void defMethod2() {
		System.out.println("defMethod2 called");
		defMethod0();
	}
	
	private void defMethod0() {
		System.out.println("defMethod0 called");
	}
	
	
	static void staMethod1() {
		System.out.println("staMethod1 called");
		staMethod0();
	}
	
	static void staMethod2() {
		System.out.println("staMethod2 called");
		staMethod0();
	}
	
	private static void staMethod0() {
		System.out.println("staMethod0 called");
	}
}
