package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) /* throws InterruptedException */ {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("인터럽션 발생");
					}
				}
			}
			
		});
		
		t.start();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("인터럽션 발생");
			}
		}
		
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("인터럽션 발생");
			}
		}
		*/
	}
}
