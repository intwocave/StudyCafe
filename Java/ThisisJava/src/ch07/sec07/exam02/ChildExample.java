package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = c;

        c.myName = "world";

        p.method1();
        p.method2();
        // p.method3();

        c.method1();
        c.method2();
        c.method3();

        Child rec = (Child) p;
        rec.method1();
        rec.method2();
        rec.method3();
        System.out.println(c.myName);
    }
}
