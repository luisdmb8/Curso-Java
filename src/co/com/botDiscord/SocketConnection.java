package co.com.botDiscord;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketConnection extends Thread{

    int puerto;
    String ip;

    public SocketConnection(int puerto, String ip) {
        this.puerto = puerto;
        this.ip = ip;
    }
    public void run(){
        try (Socket cliente = new Socket(this.ip, this.puerto)){
            Scanner scanner = new Scanner(System.in);
            PrintStream ps = new PrintStream(cliente.getOutputStream());
            DataInputStream dis = new DataInputStream(cliente.getInputStream());
            String mensaje;
            do{
                System.out.println("Escribe el mensaje aquí:");
                mensaje = scanner.nextLine();
                ps.println(mensaje);
                System.out.println("Mensaje enviado al servidor: " + mensaje);
                String respuesta = dis.readLine();
                System.out.println("Cliente recibe del servidor: " + respuesta);
            }while (!mensaje.equalsIgnoreCase("exit"));
            System.out.println("Salir de la consola");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
