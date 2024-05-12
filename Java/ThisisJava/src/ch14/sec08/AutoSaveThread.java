package ch14.sec08;

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업을 저장합니다.");
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
