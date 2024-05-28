package ch19.sec03.exam02;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
