package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + ": methodA 실행");
	
		notify();
		try { wait(); } 
		catch (InterruptedException e) {}
		 
	}

	public void methodB() {
		synchronized(this) {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + ": methodB 실행");
			
			notify();
			try { wait(); }
			catch (InterruptedException e) {}
			
		}
	}
}
