package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle myCar = new Bus();
		myCar.run();
		
		Bus bus = (Bus) myCar;
		bus.checkFare();
	}
}
