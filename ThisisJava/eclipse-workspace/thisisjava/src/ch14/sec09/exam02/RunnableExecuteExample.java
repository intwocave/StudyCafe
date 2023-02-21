package ch14.sec09.exam02;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		String[][] mails = new String[1000][3];
		System.out.println(mails.length);
		for(int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		ExecutorService exeServ = Executors.newFixedThreadPool(5); // 스레드풀 생성
		
		for (int i = 0; i < 1000; i++) {
			final int idx = i; // ??
			exeServ.execute(new Runnable() {
				@Override
				public void run() {
					Thread t = Thread.currentThread();
					System.out.println("[" + t.getName() + "]" + mails[idx][0] + " ==> " + mails[idx][1] + ": " + mails[idx][2]);
				}
			});
		}
		
		exeServ.shutdown(); // 스레드풀 종료
	}
}
