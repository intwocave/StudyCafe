package ch18.sec09;

import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class PrintStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("printer.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("myPrinter");
        ps.print("hack the planet!");

        ps.flush();
        ps.close();
        fos.close();
    }
}
