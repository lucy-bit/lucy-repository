import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-30
 * Time: 14:32
 */
class MyException extends Exception{
    public String string;
    public MyException(String s) {
        super(s);
        string = s;
    }
}

class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class TestDemo3 {

    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }

    public static void login(String userName, String password) throws
            UserError,PasswordError{
        if (!TestDemo3.userName.equals(userName)) {
            // TODO 处理用户名错误
            throw new UserError("用户名错误");
        }
        if (!TestDemo3.password.equals(password)) {
            throw new PasswordError("密码错误");
            // TODO 处理密码错误
        }
        System.out.println("登陆成功");
    }

    public static void func4() throws MyException{
        int a = 10;
        if(a == 10) {
            throw new MyException("MyException异常");
        }
    }

    public static void main7(String[] args) {
        try {
            func4();
        }catch (MyException e) {
            e.printStackTrace();
        }
    }

    //编译时期的异常-》必须编译通过(处理异常)之后 才能运行
    public static String readFile() {
        // 尝试打开文件, 并读其中的一行.
        File file = new File("d:/test.txt");
        try {
            // 使用文件对象构造 Scanner 对象.
            Scanner sc = new Scanner(file);
            return sc.nextLine();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main6(String[] args) {
        System.out.println(readFile());
    }


    public static int func3() {
        try {
            int a = 10 / 10;
            System.out.println("10/0");
            return a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 10;
        } finally {
            System.out.println("finally");
            //finally中的return会抑制 try 和 catch的return
            //return 9;
        }
    }
    public static void main5(String[] args) {
       int ret = func3();
        System.out.println(ret);
    }

    public static void func2(int a,int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("b==0");
        }
        System.out.println(a/b);
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            func2(a,b);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }
        System.out.println("java");
    }

    public static void func() {
        int b = 10/0;
        System.out.println(b);
    }

    public static void main3(String[] args) {
        try {
            func();
        }catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("捕获到了异常");
        }finally {
            System.out.println("finaly永远最后会被执行");
        }
        System.out.println("after");
    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        try {
            array = null;
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException
                | NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了异常");
        }
        System.out.println("after");
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        try {
            array = null;
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常");
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了空指针异常异常");
            System.out.println();
        }
        System.out.println("after");
    }
}
