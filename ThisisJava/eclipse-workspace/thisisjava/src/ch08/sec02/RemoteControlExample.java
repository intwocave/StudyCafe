package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		Television tv = new Television();
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(99);
		rc.turnOff();
		
		Audio audio = new Audio();
		rc = audio;
		rc.turnOn();
		rc.setVolume(120);
		rc.setVolume(-120);
		rc.turnOn();
		
		System.out.println("현재 TV의 볼륨: " + tv.volume);
		System.out.println("현재 Audio의 볼륨: " + audio.volume);
		
		RemoteControl.changeBattery();
	}
}