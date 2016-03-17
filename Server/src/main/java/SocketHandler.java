import java.io.*;
import java.net.Socket;
import java.util.StringTokenizer;

/**
 * Created by sweet on 3/16/16.
 */
public class SocketHandler extends Thread {
    private Socket mSocket;
    private BufferedReader in;
    private PrintWriter out;

    public SocketHandler(Socket socket) throws IOException {
        mSocket = socket;

        in = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(mSocket.getOutputStream())), true);
        this.start();
    }

    public void run() {
        try {
            while (true) {
                String message = in.readLine();
                if (message != null) {
                    handleMessage(message);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleMessage(String message) {
        System.out.println(message);
        StringTokenizer st = new StringTokenizer(message);
    }
}
