import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -22
 * Time: 22:52
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newSingleThreadExecutor()
        try(ServerSocket serverSocket = new ServerSocket(9393)) {
            Socket server =serverSocket.accept();
        }

    }

}
