package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        mainThread.setName("Main Thread");

        Thread chatThread = new Thread() {
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
    }
}
