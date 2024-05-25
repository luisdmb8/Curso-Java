package co.com.red;

public class Principal {
    public static void main(String[] args) {
        int puerto = 3500;
        TCPServer ser = new TCPServer(puerto);
        ser.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        TCPClient cli = new TCPClient("127.0.0.1", puerto);
        cli.start();
    }
}
