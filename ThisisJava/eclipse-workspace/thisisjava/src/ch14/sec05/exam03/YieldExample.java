package ch14.sec05.exam03;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread WorkA = new WorkThread("WorkThread A");
		WorkThread WorkB = new WorkThread("WorkThread B");
		
		WorkA.start();
		WorkB.start();
		
		try {
			Thread.sleep(5000);
			WorkA.work = false;
		} catch (InterruptedException e) {}
		
		try {
			Thread.sleep(10000);
			WorkA.work = true;
		} catch (InterruptedException e) {}
	}
}
