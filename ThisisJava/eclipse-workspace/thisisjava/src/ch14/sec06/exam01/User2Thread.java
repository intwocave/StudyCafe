package ch14.sec06.exam01;

public class User2Thread extends Thread {
	private Calculator calc;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory2(50);
	}
}
