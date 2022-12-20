package ch07.sec08;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setTire(new Tire());
		System.out.println("myCar의 현재 Tire: " + myCar.getTire());
		myCar.run();
		
		myCar.setTire(new HankookTire());
		System.out.println("myCar의 현재 Tire: " + myCar.getTire());
		myCar.run();
		
		/*
		KumhoTire kt = new KumhoTire();
		myCar.setTire(kt);
		*/
		myCar.setTire(new KumhoTire());
		System.out.println("myCar의 현재 Tire: " + myCar.getTire());
		myCar.run();
	}
}
