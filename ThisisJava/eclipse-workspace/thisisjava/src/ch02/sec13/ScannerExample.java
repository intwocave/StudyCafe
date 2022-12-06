package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		int x, y;
		
		System.out.print("x 값을 입력하세요: ");
		input = scanner.nextLine();
		x = Integer.parseInt(input);
		
		System.out.print("y 값을 입력하세요: ");
		input = scanner.nextLine();
		y = Integer.parseInt(input);
		
		System.out.println("x + y = " + (x + y));
		
		while(true) {
			System.out.print("값을 입력하세요: ");
			input = scanner.nextLine();
			
			if(input.equals("q")) {
				break;
			} else {
				System.out.println("입력된 값: " + input);
			}
		}
	}

}
