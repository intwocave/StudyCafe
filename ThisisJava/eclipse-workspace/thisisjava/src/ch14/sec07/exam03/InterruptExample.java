package ch14.sec07.exam03;

public class InterruptExample {
	public static void main(String[] args) {
		PrintThread t = new PrintThread();
		
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		t.interrupt();
	}
}
