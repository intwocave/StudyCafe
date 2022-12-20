package ch07.sec02;

public class SmartPhone extends Phone{
	boolean wifi;
	
	SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone 상속자 실행됨");

		// this.model = model;
		// this.color = color;
	}
	
	void setWifi(boolean value) {
		this.wifi = value;
		System.out.println("Wifi를 설정합니다.");
	}
	
	void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
