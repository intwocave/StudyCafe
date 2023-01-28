package ch14.sec05;

public class SumThread extends Thread{
	long sum = 0;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long num) {
		this.sum = num;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
	}
}
