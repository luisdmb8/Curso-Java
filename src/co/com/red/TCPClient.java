package co.com.red;

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
            ps.println("Hola");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
