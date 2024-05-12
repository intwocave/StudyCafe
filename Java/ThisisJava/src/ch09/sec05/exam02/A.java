package ch09.sec05.exam02;

public class A {
    String f = "A-field";

    void method() {
        System.out.println("A-method");
    }

    class B {
        String f = "B-field";

        void method() {
            System.out.println("B-method");
        }
        void print() {
            System.out.println(this.f); // = println(f)
            this.method();

            System.out.println(A.this.f);
            A.this.method();
        }
    }

    void useB() {
        B b = new B();
        b.method();
        b.print();
    }
}
