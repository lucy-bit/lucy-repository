import java.util.*;
import java.io.*;
import java.net.*;

public class CloseWaitClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8099);
        socket.close();
    }
}