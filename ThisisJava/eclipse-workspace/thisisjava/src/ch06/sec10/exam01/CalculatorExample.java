package ch06.sec10.exam01;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X: ");
		int x = Integer.parseInt(scan.next());
		
		System.out.print("Y: ");
		int y = Integer.parseInt(scan.next());
		
		System.out.println(x + " + " + y + " = " + Calculator.plus(x, y));
	}
}