import java.net.*;
import java.util.*;
public class Server {
    public static ArrayList<NetworkUtil>
            clients= new ArrayList<>();

    public static ArrayList<String>
            history= new ArrayList<>();

    public static int clientCount = 1;

    public static void main(String[] args)
            throws Exception {

        ServerSocket serverSocket = new ServerSocket(33333);
        System.out.println("Server Started..");


        while(true)
        {
            Socket socket = serverSocket.accept();
            NetworkUtil nu =new NetworkUtil(socket);

            String clientName = "Client-" + clientCount;
            clientCount++;

            nu.write(clientName);

            clients.add(nu);


            for(String msg : history) {
                nu.write(msg);
            }

            new ClientHandler(nu, clientName);
            System.out.println(clientName + " Connected");

        }
    }
}
