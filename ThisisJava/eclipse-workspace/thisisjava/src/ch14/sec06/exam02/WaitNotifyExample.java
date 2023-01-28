package ch14.sec06.exam02;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		ThreadA User1 = new ThreadA(workObject);
		ThreadB User2 = new ThreadB(workObject);
		
		User1.start();
		User2.start();
	}
}
