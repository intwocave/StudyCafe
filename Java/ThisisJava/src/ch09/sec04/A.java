package ch09.sec04;

public class A {
    A() {
        class B{}

        B b = new B();
    }

    void method() {
        class B{}

        B b = new B();
    }
}
