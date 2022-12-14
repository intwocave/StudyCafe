package ch06.sec07.exam04;

public class Car {
	String maker = null;
	String model = null;
	boolean isAWD = false;
	
	Car() {}
	/*
	Car(String maker) {
		this.maker = maker;
	}
	Car(String maker, String model) {
		this.maker = maker;
		this.model = model;
	}
	*/
	Car(String maker) {
		this(maker, null, false);
	}
	Car(String maker, String model) {
		this(maker, model, false);
	}
	Car(String maker, String model, boolean isAWD){
		this.maker = maker;
		this.model = model;
		this.isAWD = isAWD;
	}
	
	void printInfo() {
		System.out.println("Maker: " + maker);
		System.out.println("Model: " + model);
		System.out.println("isAWD: " + isAWD);
	}
}
