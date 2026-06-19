import java.io.Serializable;

public class Data implements Serializable {

    private String sender;
    private String message;

    public Data(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}