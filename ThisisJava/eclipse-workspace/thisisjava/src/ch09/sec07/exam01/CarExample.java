package ch09.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.gogo();
		
		Tire myTire = new Tire() {
			void roll() {
				System.out.println("내 익명 자식 객체가 굴러가요.");
			}
		};
		myCar.gogo2(myTire);
	}
}
