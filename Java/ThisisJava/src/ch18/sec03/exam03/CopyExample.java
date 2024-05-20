package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        byte[] buff = new byte[1024];

        String ipath = new String("rasinban_kaiten.jpeg");
        String opath = new String("copy_rasinban.jpeg");

        try {
            InputStream is = new FileInputStream(ipath);
            OutputStream os = new FileOutputStream(opath);
            /*while(is.read(buff) != -1) {
                os.write(buff);
            }*/
            is.transferTo(os); // available from Java 9 and above
            os.flush();
            os.close();
            is.close();
        } catch (FileNotFoundException e) {
            System.out.println("File \"" + ipath + "\" is not found");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed");
    }
}
