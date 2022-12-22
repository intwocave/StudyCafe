package ch08.sec12;

public class InstanceofExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		if (vehicle instanceof Bus) {
			vehicle.run();
			
			Bus bus = (Bus) vehicle;
			System.out.println("vehicle 인터페이스 객체는 Bus의 인스턴스입니다.");
			bus.givemetheMoney();
		} else if (vehicle instanceof Taxi taxi) {
			taxi.run();
			taxi.goFaster();
		}
	}
}