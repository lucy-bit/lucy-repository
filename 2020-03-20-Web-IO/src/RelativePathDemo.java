import java.io.File;
import java.io.IOException;

public class RelativePathDemo {
    public static void main(String[] args) throws IOException {
        String workingDirectory = System.getProperty("user.dir");
        System.out.println("相对路径其实是相对于这个工作路径");
        System.out.println("这个工作路径，就是进程启动时所在路径");
        System.out.println(workingDirectory);

        String filename = "我是一个相对路径的文件名.txt";

        File file = new File(filename);
        System.out.println(file.getAbsolutePath());
        file.createNewFile();
    }
}
