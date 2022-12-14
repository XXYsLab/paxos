package paxos;
import java.io.Serializable;

/**
 * Please fill in the data structure you use to represent the response message for each RMI call.
 * Hint: You may need a boolean variable to indicate ack of acceptors and also you may need proposal number and value.
 * Hint: Make it more generic such that you can use it for each RMI call.
 */
public class Response implements Serializable {
    static final long serialVersionUID=2L;
    // your data here
    boolean accept;
    int id;
    Object value;
    int done; // max seq of the instance done

    // Your constructor and methods here

    public Response(int id, Object value, boolean accept, int done) {
        this.id = id;
        this.value = value;
        this.accept = accept;
        this.done = done;
    }
}
