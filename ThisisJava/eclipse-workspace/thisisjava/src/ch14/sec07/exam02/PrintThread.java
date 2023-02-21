package ch14.sec07.exam02;

public class PrintThread extends Thread {
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중..");
				
				Thread.sleep(1); // 일시 정지 상태, InterruptedException 발생
			}
		} catch(InterruptedException e) {}
		System.out.println("리소스 정리 중..");
		System.out.println("실행 종료 중..");
	}
	
}
