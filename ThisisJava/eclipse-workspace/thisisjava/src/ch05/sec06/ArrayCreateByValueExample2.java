package ch05.sec06;

public class ArrayCreateByValueExample2 {

	public static void main(String[] args) {
		// int[] score = {1, 2, 3, 4}
		int[] score;
		// int score[];
		score = new int[] {1, 2, 3, 4};
		
		// printItems(score);
		printItems(new int[] {2, 3, 4, 5});
	}
	
	public static void printItems(int[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]: " + score[i]);
		}
	}

}
