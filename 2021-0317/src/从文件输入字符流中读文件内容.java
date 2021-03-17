import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -17
 * Time: 18:55
 */
public class 从文件输入字符流中读文件内容 {
    public static void main(String[] args) throws IOException {
        /*try(InputStream is = new FileInputStream("有中文的文件.txt")) {
            try(Reader reader = new InputStreamReader(is,"utf-8")) {
                StringBuilder sb = new StringBuilder();
                while(true) {
                    int c  = reader.read();
                    if(c == -1) {
                        break;
                    }
                    sb.append((char)c);
                }
                System.out.println(sb.toString());
            }
        }*/

        /*try(InputStream is = new FileInputStream("有中文的文件.txt")) {
            try(Reader reader = new InputStreamReader(is,"utf-8")) {
                StringBuilder sb = new StringBuilder();
                char[] buffer = new char[1024];
                while(true) {
                    int len = reader.read(buffer);
                    if(len == -1) {
                        break;
                    }
                    sb.append(buffer,0,len);
                }
                System.out.println(sb.toString());
            }
        }*/

        //只打印一行
        try(InputStream is = new FileInputStream("有中文的文件.txt")) {
            try(Reader reader = new InputStreamReader(is,"utf-8")) {
                Scanner sc = new Scanner(reader);
                while(sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }
            }
        }
       // System.arraycopy();
    }
}
