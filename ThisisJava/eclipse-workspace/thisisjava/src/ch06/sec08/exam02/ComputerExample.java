package ch06.sec08.exam02;

public class ComputerExample {
	public static void main (String[] args) {
		Computer com = new Computer();
		
		System.out.println(com.sum(1, 2, 3, 4));
		
		System.out.println(com.sum(new int[] {1, 2, 3, 4}));
		
		int[] value = {1, 2, 3, 4};
		System.out.println(com.sum(value));
		
	}
}
