package ch19.sec03.exam02;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            try {
                Socket socket = new Socket("localhost", 50001);

                System.out.println("[클라이언트] 연결 성공");

                System.out.print("보낼 메시지: ");
                String sendMsg = scanner.nextLine();

                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeUTF(sendMsg);
                System.out.println("[클라이언트] 서버로 메시지를 보냄");
                dos.flush();

                DataInputStream dis = new DataInputStream(socket.getInputStream());
                System.out.println("[클라이언트] 서버로부터 메시지를 받음: \n" + dis.readUTF());

                dis.close();
                dos.close();
                socket.close();
                System.out.println("[클라이언트] 연결 해제");
            } catch (ConnectException e) {
                System.out.println("서버 연결에 실패하였습니다.");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
