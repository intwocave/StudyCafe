package ch08.sec02;

public class Audio implements RemoteControl{
	int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			System.out.println("Audio 볼륨을 " + RemoteControl.MAX_VOLUME + "으로 설정합니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("Audio 볼륨을 " + RemoteControl.MIN_VOLUME + "으로 설정합니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			System.out.println("Audio 볼륨을 " + volume + "으로 설정합니다.");
			this.volume = volume;
		}
	}
	
	private int memVolume;
	
	public void setMute(boolean mute) {
		if (mute == true) {
			memVolume = volume;
			// volume = RemoteControl.MIN_VOLUME;
			// setVolume(MIN_VOLUME);
			setVolume(RemoteControl.MIN_VOLUME);
			System.out.println("무음 켜짐.");
		} else {
			volume = memVolume;
			System.out.println("무음 꺼짐.");
		}
	}
}
