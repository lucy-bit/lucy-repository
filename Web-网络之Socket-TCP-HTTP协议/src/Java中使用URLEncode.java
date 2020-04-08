import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Java中使用URLEncode {
    public static void main(String[] args) throws IOException {
        String url = "中";
        String urlEncoded = URLEncoder.encode(url, "UTF-8");
        System.out.println(urlEncoded);
        url = URLDecoder.decode(urlEncoded, "UTF-8");
        System.out.println(url);
    }
}
