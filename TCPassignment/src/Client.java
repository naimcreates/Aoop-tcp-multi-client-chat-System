import java.net.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args)
            throws Exception {

        Socket socket = new Socket("localhost", 33333);

        NetworkUtil nu= new NetworkUtil(socket);

        String myName = (String) nu.read();


        System.out.println(myName + " Connected");

        new ClientReader(nu);


        Scanner sc = new Scanner(System.in);

        while(true) {
            String msg = sc.nextLine();

            Data data = new Data(myName, msg);
            nu.write(data);
        }
    }
}