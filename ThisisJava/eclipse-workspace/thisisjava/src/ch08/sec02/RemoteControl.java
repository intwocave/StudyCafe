package ch08.sec02;

public interface RemoteControl {
	// [public static] int MIN_VOLUME = 0;
	// [public static] int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;
	
	// [public abstract] void turnOn();
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute == true) {
			setVolume(MIN_VOLUME);
			System.out.println("무음 켜짐.");
		} else {
			System.out.println("무음 꺼짐.");
		}
	}
	
	//public static void changeBattery() {}
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
}
