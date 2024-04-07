package ch09.sec05.exam01;

public class A {
    int f1;
    void m1() {}

    static int f2;
    static void m2() {}

    class B {
        void method1() {
            f1 = 0;
            m1();

            f2 = 0;
            m2();
        }

        static void method2() {
            // f1 = 0;
            // m1();

            f2 = 10;
            m2();
        }
    }
}
