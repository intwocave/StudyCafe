package ch13;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thd = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit tk = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    tk.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }
            }
        });

        thd.start();
        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
