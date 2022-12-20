package ch08.sec07;

public class ServiceExample {
	public static void main(String[] args) {
		Service serv = new ServiceImpl();
		serv.defMethod1();
		serv.defMethod2();
		
		Service.staMethod1();
		Service.staMethod2();
	}
}
