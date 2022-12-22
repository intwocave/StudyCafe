package ch08.sec02;

public class Television implements RemoteControl{
	int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			System.out.println("TV 볼륨을 " + RemoteControl.MAX_VOLUME + "으로 설정합니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			System.out.println("TV 볼륨을 " + RemoteControl.MIN_VOLUME + "으로 설정합니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			System.out.println("TV 볼륨을 " + volume + "으로 설정합니다.");
			this.volume = volume;
		}
	}
}