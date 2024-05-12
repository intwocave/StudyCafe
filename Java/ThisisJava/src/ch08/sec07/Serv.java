package ch08.sec07;

public interface Serv {
    default void defMeth1() {
        System.out.println("defMeth1");
        defComm();
    }

    private void defComm() {
        System.out.println("defMeth의 중복 코드");
    }

    static void statMeth1() {
        System.out.println("statMeth1");
        statComm();
    }

    private static void statComm() {
        System.out.println("statMeth의 중복 코드");
    }
}
