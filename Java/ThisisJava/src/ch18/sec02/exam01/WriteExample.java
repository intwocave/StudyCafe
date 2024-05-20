package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        try {
            OutputStream os = new FileOutputStream("output.txt");

            byte a = 10;
            byte b = 20;
            byte[] arr = {10, 20, 30, 40, 50, 60};

            os.write(a);
            os.write(b);
            os.write(arr);

            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
