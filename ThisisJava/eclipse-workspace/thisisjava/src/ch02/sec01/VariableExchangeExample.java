package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int temp;
		System.out.println("x: " + x + ", y: " + y);
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);	
	}
}
