public class ClientReader
        implements Runnable {
    private NetworkUtil nu;

    public ClientReader(NetworkUtil nu)
    {
        this.nu = nu;

        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            while(true) {

                Object o = nu.read();
                System.out.println(o);
            }

        }
        catch(Exception e) {
            System.out.println("Disconnected");
        }
    }
}