package ch12.sec03.exam03;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Samsung", "Android");
		SmartPhone yourPhone = new SmartPhone("Apple", "iOS");
		
		System.out.println(myPhone.toString());
		System.out.println(yourPhone.toString());
		
		System.out.println();
		
		System.out.println(myPhone);
		System.out.println(yourPhone);
	}
}
