package co.com.red;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClient extends Thread{
    private String ip;
    private int puerto;

    public TCPClient(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public void solicitar(){
        try (Socket cliente = new Socket(this.ip, this.puerto)){
            PrintStream ps = new PrintStream(cliente.getOutputStream());
            DataInputStream dis = new DataInputStream(cliente.getInputStream());
            ps.println("Hola");
            while(dis.available() > 0){
                System.out.println("Esta es la prueba del dis " + dis.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
