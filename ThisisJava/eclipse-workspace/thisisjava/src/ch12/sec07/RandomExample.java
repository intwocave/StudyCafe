package ch12.sec07;

import java.util.Random;
import java.util.Arrays;

public class RandomExample {
	public static void main(String[] args) {
		Random random = new Random(3);
		int[] myLotto = new int[6];
		System.out.println("당신의 로또 번호: ");
		for(int i = 0; i < 6; i++) {
			myLotto[i] = random.nextInt(45) + 1;
			System.out.print(myLotto[i] + " ");
		}
		
		System.out.println();
		
		random = new Random(5);
		int[] atariLotto = new int[6];
		System.out.println("당첨 로또 번호: ");
		for(int i = 0; i < 6; i++) {
			atariLotto[i] = random.nextInt(45) + 1;
			System.out.print(atariLotto[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		Arrays.sort(myLotto);
		Arrays.sort(atariLotto);
		
		if(Arrays.equals(myLotto, atariLotto)) {
			System.out.println("로또에 당첨되셨습니다!");
		} else {
			System.out.println("꽝입니다 T^T");
		}
	}
}
