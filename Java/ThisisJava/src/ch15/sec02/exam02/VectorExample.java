package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread t1 = new Thread() {
           public void run() {
               for (int i = 1; i <= 1000; i++) {
                   list.add(new Board("제목"+i, "내용"+i, "작성자"+1));
               }
           }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "작성자"+1));
                }
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
