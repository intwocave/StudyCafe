package ch14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread t = new AutoSaveThread();
		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
	}
}
