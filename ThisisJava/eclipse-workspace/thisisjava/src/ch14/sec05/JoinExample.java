package ch14.sec05;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		System.out.println(sumThread.getSum());
		sumThread.start();
		try {
			sumThread.join();
		} catch(InterruptedException e) {}
		
		System.out.println("연산 결과: " + sumThread.getSum());
	}
}
