import java.io.*;
import java.util.*;

public class CatCommand {
    // 如果给出了文件路径，就输出文件路径中的内容
    // 如果没有给出，则从标准输入中读取内容
    // 只允许传入一个文件路径
    public static void main(String[] args) throws IOException {
        InputStream is;
        boolean fromFile = false;
        // 如何判断执行命令时，是否有传入文件路径？
        // args 存放的就是用户传入的参数
        if (args.length == 0) {
            // 用户没有传入参数
            is = System.in;
        } else {
            // 用户传入了参数
            is = new FileInputStream(args[0]);
            fromFile = true;
        }

        Scanner scanner = new Scanner(is, "UTF-8");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        if (fromFile) {
            is.close();
        }
    }
}