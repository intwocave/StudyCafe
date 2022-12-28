package ch09.sec07.exam02;

public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		Remocon rc = new Remocon() {
			public void turnOn() {
				System.out.println("익명 구현 객체 TV를 켤게요.");
			}
			
			public void turnOff() {
				System.out.println("익명 구현 객체 TV를 끌게요.");
			}
		};
		home.use3(rc);
	}
}
