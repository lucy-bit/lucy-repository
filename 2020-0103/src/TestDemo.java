import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: nanan
 * Date: 2019-10-17
 * Time: 18:55
 */
public class HomeWork {

    public static void printAge(int age) {
        if(age <= 18) {
            System.out.println("少年");
        }else if( age >= 19 && age<=28){
            System.out.println("青年");
        }else if(age >= 29 && age<=55) {
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }
    //n:1  3    7   只能被1和本身整除  2-n-1
    public static boolean isPrime1(int n) {
        for (int i = 2; i < n ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //16: n = a*b   4*4  2*8  1*16  <=n/2
    public static boolean isPrime2(int n) {
        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //8: n = a*b   2*4  1*8    <= 根号n 2.8
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /*
        1、打断点
        2、开始调试
        ctr+shift+/  行注释
        ctr+/  块注释
   */
    public static boolean isLeapYear(int year) {
        if(year%4==0 && year%100!=0 || year%400==0) {
            return true;
        }
        return false;
    }

    public static int func1(int a,int b) {
        int tmp = 0;//保存余数
        while(a%b!=0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static double sumN(int n) {
        double sum = 0.0;
        int flg = 1;
        //i是分母
        for (int i = 1; i <= n ; i++) {
            sum += 1.0/i * flg;
            flg = -flg;
        }
        return sum;
    }
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    //9  19 29 ......89   90 91.....99  20
    //9%10=9    91/10=9   99
    public static int func2(int n) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(i % 10 == 9) {
                count++;
            }
            if(i / 10 == 9) {
                count++;
            }
        }
        return count;
    }
    //求出0～999999之间的所有“水仙花数”并输出
    public static void waterFlower(int n) {
        for (int i = 0; i <= n ; i++) {
            //1、求位数
            int count = 0;//位数
            int tmp = i;
            while(tmp != 0) {
                count++;
                tmp /= 10;
            }
            //count里面保存的就是当前i的位数
            tmp = i;
            //求tmp的每一个位上的数字
            //123   123%10=3  123/10 %10=2
            //12/10%10=1   1/10=0
            int sum = 0;//次方的和
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }

    public static void func3() {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            System.out.println("请输入你的密码：");
            String password = scanner.nextLine();
            //if(password == "abcde") {
            //if(password.equals("abcde")) {
            if("abcde".equals(password)) {
                System.out.println("输入正确！");
                break;
            }else {
                System.out.println("密码错误!");
                count--;
            }
        }
    }
    //写一个函数返回参数二进制中 1 的个数
    //15    0000 1111    4
    //123   123%10=3   123/10=12%10=2
    public static int numberOfOne1(int num) {
        int count = 0;
        while (num != 0) {
            if(num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        return count;
    }

    public static int numberOfOne(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num-1);
        }
        return count;
    }

    //使用位运算求两个数的平均值
    public static int avg(int a,int b) {
        return (a&b) + (a^b)>>1;
    }

    public static void printNum(int n) {
        for (int i = 31; i >= 1 ; i -= 2) {
            System.out.print(((n >> i)&1) + " ");
        }
        System.out.println();
        System.out.println("===========");
        for (int i = 30; i >= 0 ; i -= 2) {
            System.out.print(((n >> i)&1)+" ");
        }
    }

    public static void main(String[] args) {

        printNum(6);
        // System.out.println(avg(7,8));

        //String str = null;
        //System.out.println(str.equals("abcde"));
        //System.out.println("abcde".equals(str));

        //func3();

        /*int a = scanner.nextInt();
        waterFlower(a);
        int ret = func1(10,6);
        System.out.println(ret);
        int b = scanner.nextInt();
        int ret = func1(a,b);
        System.out.println(ret);
        for (int i = 1000; i < n; i++) {
            if(isLeapYear(i)) {
                System.out.println(i);
            }
        }*/
        //boolean flg = isPrime(n);
        //System.out.println(flg);//sout
    }
}
