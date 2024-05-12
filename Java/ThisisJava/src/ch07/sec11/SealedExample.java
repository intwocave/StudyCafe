package ch07.sec11;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Director d = new Director();
        Manager m = new Manager();

        p.work();
        e.work();
        d.work();
        m.work();
    }
}
