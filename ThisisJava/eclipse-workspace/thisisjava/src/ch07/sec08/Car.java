package ch07.sec08;

public class Car {
	private Tire tire;
	
	void run() {
		tire.roll();
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public Tire getTire() {
		return tire;
	}
}
