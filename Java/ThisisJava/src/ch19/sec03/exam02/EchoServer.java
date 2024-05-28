package ch19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
// import java.io.InputStream;
// import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("-------------------------------------------");

        // TCP 서버 시작

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String string = scanner.nextLine();
            if(string.toLowerCase().equals("q")) {
                break;
            }
        }

        // TCP 서버 종료
    }

    public static void startServer() {
        Thread thread = new Thread() {
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    // 연결 수락 및 데이터 통신
                    while(true) {
                        System.out.println("\n[서버] 연결 요청을 기다림");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + inetSocketAddress.getHostName() + "의 연결 요청을 수락함");

                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        // String str = dis.readUTF();
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(dis.readUTF());
                        System.out.println("[서버] echo message: " + dis.readUTF());

                        dos.flush();
                        dos.close();
                        dis.close();

                        socket.close();
                        System.out.println("[서버] 클라이언트와 연결을 끊음");
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
