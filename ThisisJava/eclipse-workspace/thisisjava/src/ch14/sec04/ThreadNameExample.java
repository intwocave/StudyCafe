package ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(this.getName() + " 실행");
					// super.run();
				}
			};
			
			threadA.run();
		}
		
		Thread chatThread = new Thread() {
			public void run() {
				this.setName("chatThread");
				System.out.println(this.getName() + " 실행");
			}
		};
		
		chatThread.run();
	}
}
