package ch09.sec07.exam01;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		void roll() {
			System.out.println("익명 자식 객체 타이어가 굴러가요.");
		}
	};
	
	void gogo() {
		tire1.roll();
		tire2.roll();
	}
	
	void gogo2(Tire tire) {
		tire.roll();
	}
}