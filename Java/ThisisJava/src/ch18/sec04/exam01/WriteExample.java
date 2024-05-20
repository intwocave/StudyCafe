package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("writefile.txt");
            String str = new String("Hell world!");

            writer.write(str);

            writer.flush();
            writer.close();
        } catch (IOException e) {}
    }
}
