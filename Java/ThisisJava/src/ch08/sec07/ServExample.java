package ch08.sec07;

public class ServExample {
    public static void main(String[] args) {
        Serv svc = new ServImpl();
        Serv.statMeth1();
        svc.defMeth1();
    }
}
