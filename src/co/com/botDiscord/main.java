package co.com.botDiscord;

import java.net.ServerSocket;

public class main {
public static void main(String[] args) {
    int puerto = 5000;
    String ip = "18.227.102.153";
    SocketConnection2 dis = new SocketConnection2(puerto, ip);
    dis.run();
}
}
