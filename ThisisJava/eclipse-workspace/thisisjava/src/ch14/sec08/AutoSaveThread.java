package ch14.sec08;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("자동으로 저장합니다.");
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("AutoSaveThread에서 인터럽트가 발생했습니다.");
				break;
			}
			save();
		}
	}
}
