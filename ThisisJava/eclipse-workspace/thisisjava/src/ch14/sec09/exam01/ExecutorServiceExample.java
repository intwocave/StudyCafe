package ch14.sec09.exam01;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		ExecutorService exeServ = Executors.newFixedThreadPool(5); // 스레드풀 생성
		// 스레드풀 작업 요청과 처리
		exeServ.shutdown(); // 스레드풀 종료
	}
}
