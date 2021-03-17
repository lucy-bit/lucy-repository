import java.io.File;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -17
 * Time: 16:27
 */
public class makeDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("楠楠.txt");
        System.out.println("对象创建成功");
        sc.nextLine();
        file.mkdir();
        System.out.println("文件创建成功");
        sc.nextLine();
        //delete();//立即删除
        file.deleteOnExit();//JVM退出时才删除
        System.out.println("文件删除成功");
        sc.nextLine();

    }
    public static void delete() {
        File file = new File("楠楠.txt");
        file.delete();
    }
}
