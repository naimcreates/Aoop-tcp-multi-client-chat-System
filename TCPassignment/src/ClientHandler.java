public class ClientHandler implements Runnable {

    private NetworkUtil nu;
    private String clientName;

    public ClientHandler(NetworkUtil nu, String clientName) {
        this.nu = nu;
        this.clientName = clientName;

        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            while(true) {
                Object o = nu.read();


                if(o instanceof Data) {
                    Data d = (Data) o;
                    System.out.println(d.getSender()+ ": "+d.getMessage());
                    String fullMessage = d.getSender()+ ": "+d.getMessage();
                    Server.history.add(fullMessage);

                    for(NetworkUtil client : Server.clients) {
                        try {
                            if(client != nu)
                            {
                                client.write(fullMessage);
                            }
                        }
                        catch(Exception e) {
                        }
                     }
                }
            }

        }
        catch(Exception e) {
            System.out.println(clientName +" Disconnected");
        }
    }
}