package ch06.sec07.exam05;

public class Car {
    String vendor = "Hyundai Motors";
    String model = "Grandeur";
    int fuel = 30;
    int km = 30000;

    public Car(String vendor) {
        this(vendor, "Grandeur", 30, 30000);
    }

    public Car(String vendor, String model, int fuel, int km) {
        this.vendor = vendor;
        this.model = model;
        this.fuel = fuel;
        this.km = km;
    }

    public void info() {
        System.out.println("vendor: " + vendor);
        System.out.println("model: " + model);
        System.out.println("fuel: " + fuel);
        System.out.println("km: " + km);
    }
}
