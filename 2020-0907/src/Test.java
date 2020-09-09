import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -07
 * Time: 16:50
 */
public class Test {
    public static int myBinarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length;

        while(left <= right) {
            int mid = (left + right)/2;
            //可优化为 mid = (left+right)>>>2
            //无符号右移：位运算的速度快
            if(arr[mid] < key) {
                left = mid + 1;
            }else if(arr[mid] > key) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {2,4,7,9,10,14};
        int key = 10;
        System.out.println( myBinarySearch(array,key));
        // Arrays.binarySearch(array,5);
        // Arrays工具类中含有二分查找法
    }
    public static int maxArray(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main15(String[] args) {
        //找出一个数组中的最大值
        int[] array = {1,2,3,4,5,6};
        System.out.println(maxArray(array));
    }
    public static int[] copyArray(int[] arr) {
        int [] tmp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }
    public static void main14(String[] args) {
        //拷贝数组
        int[] array = {1,2,3,4,5};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
        int [] ret2 = Arrays.copyOf(array,array.length);
    }

    public static String myToString(int[] arr) {
        String str = "[";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length-1)
            str += ",";
        }
        str +="]";
        return str;
    }
    public static void main13(String[] args) {
        //自己实现ToString方法
        int[] array = {1,2,3,4,5};
        System.out.println(myToString(array));
    }

    public static void move(char post1,char post2) {
        System.out.print(post1 + "->" + post2 +" ");
    }
    //n:一共有多少个盘子
    //post1：起始位置
    //post2：中途位置
    //post3：目的地位置
    public static void hanoi(int n,char post1,char post2,char post3) {
        if(n == 1) {
            move(post1,post3);
        }else {
            hanoi(n-1,post1,post3,post2);
            move(post1,post3);
            hanoi(n-1,post2,post1,post3);
        }
    }
    public static void main12(String[] args) {
        //汉诺塔问题
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        System.out.println();
    }
    public static int func3(int n) {
        //递归法
        if(n == 1 || n == 2)
            return 1;
        return func3(n-1) + func3(n-2);
    }
    public static int func4(int n) {
        //迭代法（循环）
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for(int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main11(String[] args) {
        //计算斐波那契数列
        System.out.println(func3(8));
        System.out.println(func4(8));
    }
    public static int func2(int n) {
        if(n < 10) {
            return n;
        }
        return n%10 + func2(n/10);
    }
    public static void main10(String[] args) {
        System.out.println(func2(1729));
    }
    public static int func(int n) {
        if(n == 1) {
            return 1;
        }
        return n + func(n-1);
    }
    public static void main9(String[] args) {
        //求1+2+。。。+9的和
        //使用递归思想
        System.out.println(func(3));
    }
    public static int sum(int n1,int n2) {
        return n1+n2;
    }
    public static double sum(double n1,double n2) {
        return n1 + n2;
    }
    public static char sum(char n1,char n2) {
        return (char)(n1 + n2);
    }
    public static void main8(String[] args) {
        //练习方法的重载
        System.out.println(sum(1,1));
        System.out.println(sum(1.0,1.0));
        System.out.println(sum('a','b'));
    }
    public static int fac(int n) {
        int ret = 1;
        for(int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
    public static int factor(int n) {
        int sum = 0;
        for(int i = 1; i <=n; i++) {
            sum += fac(i);
        }
        return sum;
    }
    public static void main6(String[] args) {
        //求阶乘之和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factor(n));
    }


    public static int maxNum(int n1,int n2) {
        return n1>n2 ? n1 : n2;
    }
    public static int maxThreeNum(int n1,int n2,int n3) {
        return maxNum(maxNum(n1,n2),n3);
    }
    public static void main5(String[] args) {
        //求三个数的最大值

        System.out.println(maxThreeNum(1, 2, 3));
    }
    public static void main4(String[] args) {
        //求15的二进制0000 1111中包含多少个1
        //利用位运算，将最后一位和1进行与运算，若为1，则count++
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //打印奇数位
        for(int i = 31; i >= 1; i -= 2) {
            System.out.print( ( (num>>i) & 1) + " ");
        }
        System.out.println();
        //打印偶数位
        for(int i = 30; i >= 0; i -= 2) {
            System.out.print( ( (num>>i) & 1) + " ");
        }
       /* int count = 0;
        while(num != 0) {
            num = num & (num-1);
            count++;
        }
       *//* for(int i = 0; i < 32; i++) {
            if(((num>>i) & 1) == 1) {
                count++;
            }
        }*//*
        System.out.println(count);*/
    }
    public static void main3(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            int getCount = 1;
            for(int j = 1; j <= i; j++) {
                getCount *= j;
            }
            sum += getCount;
        }
        System.out.println(sum);
    }
    public static void main2(String[] args) {
       /* int a;
        System.out.println(a);*/
       for(int i = 0; i <args.length; i++) {
           System.out.println(args[i]);
       }
        System.out.println(args);
        System.out.println("over");
    }
}
