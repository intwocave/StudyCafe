package ch09.sec07.exam02;

public interface Remocon {
	void turnOn();
	void turnOff();
	
	default void turnOnOff() {
		this.turnOn();
		this.turnOff();
	}
}
