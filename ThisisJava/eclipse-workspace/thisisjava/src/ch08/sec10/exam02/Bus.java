package ch08.sec10.exam02;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("GO! GO! MANIAC");
	}
	
	public void checkFare() {
		System.out.println("Give me the money");
	}
	
}
