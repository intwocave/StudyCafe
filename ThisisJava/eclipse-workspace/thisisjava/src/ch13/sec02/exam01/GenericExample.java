package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		Product<TV, String> product = new Product();
		product.setKind(new TV());
		product.setModel("LG Display");
		System.out.println(product.getKind() + " " + product.getModel());
		
		Product<Car, String> myCar = new Product();
		myCar.setKind(new Car());
		myCar.setModel("Hyundai");
		System.out.println(myCar.getKind() + " " + myCar.getModel());
	}
}
