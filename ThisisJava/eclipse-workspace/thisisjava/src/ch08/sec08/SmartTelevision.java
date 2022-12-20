package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void Search(String url) {
		System.out.println(url);
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켜요.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 꺼요.");
	}

}
