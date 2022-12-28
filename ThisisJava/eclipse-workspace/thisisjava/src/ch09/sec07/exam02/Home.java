package ch09.sec07.exam02;

public class Home {
	private Remocon rc = new Remocon() {
		public void turnOn() {
			System.out.println("익명 구현 객체 TV를 켤게요.");
		}
		
		public void turnOff() {
			System.out.println("익명 구현 객체 TV를 끌게요.");
		}
	};
	
	void use1() {
		rc.turnOnOff();
	}
	
	void use2() {
		Remocon rc = new Remocon() {
			public void turnOn() {
				System.out.println("익명 구현 객체 TV를 켤게요.");
			}
			
			public void turnOff() {
				System.out.println("익명 구현 객체 TV를 끌게요.");
			}
		};
		rc.turnOnOff();
	}
	
	void use3(Remocon rc) {
		rc.turnOnOff();
	}
}
