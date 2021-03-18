import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -18
 * Time: 23:23
 */
public class 分割url {
    private static Map<String,Integer> map = new HashMap<>();
    static {
        map.put("ssl",22);
        map.put("http",80);
        map.put("https",443);
        map.put("jdbc:mysql",3306);
    }

    public static void main(String[] args) {
        String[] urls = {
                "https://github.com/lucy-bit",
                "http://bitedu.vip/?fd32ae99c5131956ff0f9e6b0e5af094",
                "https://blog.csdn.net/logicr/article/details/79534310"
        };
        for(int i = 0; i < urls.length; i++) {
            System.out.println(urls[i]);
            分割(urls[i]);
            System.out.println("==============================================");
        }
    }
    public static void 分割(String url) {
        //1.协议
        int i = url.indexOf("://");
        String hUrl = url.substring(0,i);
        System.out.println(hUrl);
        //2.域名
        //3.端口
        String rest = url.substring(i+3);
        String[] wUrl = rest.split(":");
        String ww = "";
        int port = 0;
        if(wUrl.length == 1) {
            //没有显示端口
            ww = rest;
            port = map.get(hUrl);
        }else {
            ww = wUrl[0];
            port = Integer.valueOf(wUrl[1]);
        }
        System.out.println(ww);
        System.out.println(port);
        //4.路径
        //5.查询字符串
        int j = rest.indexOf("/");
        String last = rest.substring(j);
        String path = "";
        String search = "";
        String[] paths = last.split("\\?");
        if(paths.length == 1) {
            //没有查询字符串
            path = last;
            search = null;
        }else {
            path = paths[0];
            search = paths[1];
        }
        System.out.println(path);
        System.out.println(search);



    }

}
