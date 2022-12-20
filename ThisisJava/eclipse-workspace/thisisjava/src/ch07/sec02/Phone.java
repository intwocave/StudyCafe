package ch07.sec02;

public class Phone {
	String model;
	String color;
	
	Phone(String model, String color) {
		System.out.println("Phone 상속자 실행됨");
		this.model = model;
		this.color = color;
	}
	
	void bell() {
		System.out.println("Bell");
	}
	
	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
