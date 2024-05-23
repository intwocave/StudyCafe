package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {
        // String oriFilePath = BufferExample.class.getResource("copy1.zip").getPath();
        String oriFilePath = "copy1.zip";
        String tarFilePath = "copycopy1.zip";

        // String oriFilePath_buff = BufferExample.class.getResource("copy2.zip").getPath();
        String oriFilePath_buff = "copy2.zip";
        String tarFilePath_buff = "copycopy2.zip";

        long time;

        try {
            InputStream fis = new FileInputStream(oriFilePath);
            OutputStream fos = new FileOutputStream(tarFilePath);
            time = copy(fis, fos);
            System.out.println("No buffered copy time: " + time + " ns");
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + oriFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream fis = new FileInputStream(oriFilePath_buff);
            OutputStream fos = new FileOutputStream(tarFilePath_buff);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            time = copy(bis, bos);
            System.out.println("Buffered copy time: " + time + " ns");
            bis.close();
            bos.close();
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + oriFilePath_buff);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static long copy(InputStream fis, OutputStream fos) {
        byte[] buf = new byte[1024];

        long t_start = System.nanoTime();
        try {
            while(fis.read(buf) != -1) {
                // System.out.printf(fis.transferTo(fos) + " transferred\n");
                // fos.write(buf, 0, buf.length);
                fos.write(buf, 0, buf.length);
            }
        } catch (IOException e) {}
        long t_stop = System.nanoTime();

        return t_stop - t_start;
    }
}
