package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/exam02/ReadLineExample.java"));
            for(int lineNum = 1;; lineNum++) {
                String str = br.readLine();
                if (str == null) break;
                System.out.println(lineNum + "\t" + str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
