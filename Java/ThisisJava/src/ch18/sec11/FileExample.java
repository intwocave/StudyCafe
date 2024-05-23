package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("myPath/A/B/C");
        File f1 = new File("myPath/A/B/file1.txt");
        File f2 = new File("myPath/A/B/file2.txt");
        File f3 = new File("myPath/A/B/file3.txt");

        System.out.println("Does directory \"dir\" exist?: " + dir.exists());
        if(!dir.exists()) {
            System.out.println("Mkdir..");
            dir.mkdirs();
        }
        System.out.println("Does directory \"dir\" exist?: " + dir.exists());
        f1.createNewFile();
        f2.createNewFile();
        f3.createNewFile();
    }
}
