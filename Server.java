
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting for client...");

        Socket s = ss.accept();
        System.out.println("Client connected");

        DataInputStream in = new DataInputStream(s.getInputStream());
        String msg = in.readUTF();

        System.out.println("Message from client: " + msg);

        in.close();
        s.close();
        ss.close();
    }
}
