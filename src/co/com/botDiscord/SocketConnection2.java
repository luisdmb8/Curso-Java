package co.com.botDiscord;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
public class SocketConnection2 implements Runnable{

    int puerto;
    String ip;

    public SocketConnection2(int puerto, String ip) {
        this.puerto = puerto;
        this.ip = ip;
    }
    public void run() {
        try (Socket cliente = new Socket(this.ip, this.puerto)) {
            Scanner scanner = new Scanner(System.in);
            ObjectOutputStream outStream = new ObjectOutputStream(cliente.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(cliente.getInputStream());
            ArrayList<String> mensajes = new ArrayList<>();
            String mensaje;
            System.out.println("Escribe el mensaje aquí :");
            mensaje = scanner.nextLine();
            mensaje = "Cualqueir texto";
            mensajes.add(mensaje);


            do {
                outStream.writeObject(mensaje);
                System.out.println("Mensaje enviado al servidor: " + mensaje);
                Object respuestaObjeto = inStream.readObject();
                String respuesta = (String) respuestaObjeto;
                mensajes.add(respuesta);
                System.out.println("Cliente recibe del servidor: " + respuesta);
            } while (!mensaje.equalsIgnoreCase("exit"));


            System.out.println("Salir de la consola");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
