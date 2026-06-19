import java.io.*;
import java.net.*;

public class NetworkUtil {

    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public NetworkUtil(Socket socket) throws Exception {

        this.socket = socket;

        oos = new ObjectOutputStream(
                socket.getOutputStream());

        ois = new ObjectInputStream(
                socket.getInputStream());
    }

    public void write(Object o)
            throws Exception {

        oos.writeObject(o);
        oos.flush();
    }

    public Object read()
            throws Exception {

        return ois.readObject();
    }

    public Socket getSocket() {
        return socket;
    }
}