package ch13.sec02.exam02;

public class GenericExample {
	public static void main(String[] args) {
		// Rentable<Home> myRent = new HomeAgency();
		HomeAgency myRent = new HomeAgency();
		Home myHome = myRent.rent();
		myHome.turnOnLight();
		
		// Rentable<Car> myRent2 = new CarAgency();
		CarAgency myRent2 = new CarAgency();
		Car myCar =myRent2.rent();
		myCar.run();
	}
}
