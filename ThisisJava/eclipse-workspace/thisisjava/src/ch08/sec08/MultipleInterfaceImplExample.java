package ch08.sec08;

public class MultipleInterfaceImplExample {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		Searchable search = new SmartTelevision();
		
		rc.turnOn();
		search.Search("www.google.com");
	}
}
