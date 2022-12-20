package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) { 
		SmartPhone myPhone = new SmartPhone("Galaxy S20", "Orion White");
		
		System.out.println(myPhone.color);
		myPhone.bell();
	}
}
