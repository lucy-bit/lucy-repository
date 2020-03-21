import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /*
        // 传入路径，构造文件对象
        // 路径可以是绝对路径，可以是相对路径
        {
            // File 对象的实际文件不存在
            String path = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO\\没有这个文件.txt";
            File file = new File(path);
            System.out.println(file);
        }

        {
            // File 对象的实际文件存在
            String path = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO\\我是一个文件.txt";
            File file = new File(path);
            System.out.println(file);
        }

        // 传入一个父路径
        {
            String parent = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO";
            String path = "src";
            File file = new File(parent, path);
            System.out.println(file);

            // 获取常见的属性
            System.out.println(file.exists());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.getParent());
            System.out.println(file.isAbsolute());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
        }
        */

        /*
        {
            // 演示文件的创建（普通文件）
            String parent = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO\\没有这个目录";
            String filename = "即将拥有的世界.txt";

            File file = new File(parent, filename);
            System.out.println(file.exists());
            boolean success = file.createNewFile();
            if (success) {
                System.out.println(filename + " 被创建成功");
            } else {
                System.out.println(filename + " 已经存在");
            }
        }
        */

        /*
        {
            // 演示文件夹的创建过程
            String parent = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO";
            String filename = "一个事先不存在的文件夹\\一个新的文件夹";

            File file = new File(parent, filename);
            System.out.println(file.exists());

            // mkdir : make directory
            //boolean success = file.mkdir();
            // mkdirs: 会把需要创建的中间文件夹一并创建出来
            boolean success = file.mkdirs();
            if (success) {
                System.out.println(filename + " 文件夹创建成功");
            } else {
                System.out.println(filename + " 文件夹原来就存在");
            }
        }
        */

        /*
        {
            String parent = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO";
            String filename = "一个文件.txt";
            File file = new File(parent, filename);
            System.out.println(file.exists());
            file.deleteOnExit();    // 也是把文件删掉，但不是马上删，而是等 JVM 进程结束后才删除
            Scanner scanner = new Scanner(System.in);
            System.out.println("只要我不按回车，就不会删除");
            scanner.nextLine();
            // 只能删除一个空的文件夹
            boolean delete = file.delete(); // 不是移动到回收站，而是直接删除
            if (delete) {
                System.out.println("删除了");
            } else {
                System.out.println("就不存在，没删");
            }
        }
        */

        {
            String path = "E:\\比特科技\\课程\\JavaWeb\\Java20班\\2020-03-20-Web-IO";
            File dir = new File(path);

            File[] files = dir.listFiles();
            // files == null
            // files.length == 0
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
