/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -03 -20
 * Time: 18:55
 */
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\86187\\Desktop\\比特学习资料\\Web\\没有这个文件夹";
        File file = new File(path);
        System.out.println(file);
        System.out.println(file.isHidden());

        String parent = "C:\\Users\\86187\\Desktop\\比特学习资料\\Web\\我是文件夹";
        String filename = "一个事先不存在的文件夹\\一个新的文件夹";
        File file2 = new File(parent,filename);
        System.out.println(file2.exists());

        boolean success = file2.mkdirs();
        if(success) {
            System.out.println(filename + "文件夹创建成功");
        }else {
            System.out.println(filename + "本来就存在");
        }

        file2.deleteOnExit();
        Scanner sc = new Scanner(System.in);
        System.out.println("没按回车");
        sc.nextLine();
        boolean delete = file2.delete();
        if(delete) {
            System.out.println("删除了");
        }else {
            System.out.println("没删除");
        }
        String path2 = "C:\\Users\\86187\\Desktop\\比特学习资料\\Web";
        File dir = new File(path2);
        File[] files = dir.listFiles();
        if(files!=null) {
            for (File file3: files) {
                System.out.println(file3.getName());
            }
        }


    }
}
