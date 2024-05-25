package co.com.red;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread{
    private int puerto;

    public TCPServer(int puerto){
        this.puerto = puerto;
    }

    public void run(){
        try (ServerSocket server = new ServerSocket(this.puerto)){
            System.out.println("Port Conection " + puerto);
            Socket con = server.accept();
            System.out.println("Acepta Conection " + con.getInetAddress().getHostAddress());
                DataInputStream dis = new DataInputStream(con.getInputStream());
                while(dis.available() > 0){
                    System.out.println(dis.readLine());
                }
            } catch (IOException e) {
             e.printStackTrace();
        }
    }
}
