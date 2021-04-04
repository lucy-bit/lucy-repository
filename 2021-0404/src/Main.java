/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -04
 * Time: 23:53
 */
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            //求阶乘这种方法不行，因为会造成栈溢出
            //阶乘的本质是将n~1个数分解得到的全部质数相乘。求末尾有多少个0，转化为求有多少个10相乘，10=2*5，
            //分解得到的质数中2的数量一定比5大，所以转化为求有多少个5就行。如果质数中含5，该数一定是5的倍数
            int n = sc.nextInt();

            int count = 0;
            for(int i = n; i >= 5; i--) {
                //不能直接用i去除，因为要从n开始一个一个遍历
                int tmp = i;
                while(tmp%5 == 0) {
                    count++;
                    tmp /= 5;
                }
            }
            System.out.println(count);
        }
    }

}*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int count = 0;
        int[][] arr = new int[W][H];
        //一种方法：遍历所有盒子，若距该盒子的上下左右2距离长的任意盒子里有蛋糕，该格子不能放蛋糕
         /*
         for(int i = 0; i < W; i++) {
             for(int j = 0; j < H; j++) {

                 if(!containsCake(arr,i,j)) {
                     arr[i][j] = 1;
                     count++;
                 }
             }
         }
         System.out.println(count);
         */

        //第二种方法：遍历所有盒子，若盒子为0则可以放蛋糕，并且让距它右边、下边2长度的地方的值改为-1，不能放蛋糕
        for(int i = 0; i < W; i++) {
            for(int j = 0; j < H; j++) {
                if(arr[i][j] == 0) {
                    count++;
                    if(i+2 < W) {
                        arr[i+2][j] = -1;
                    }
                    if(j+2 < H) {
                        arr[i][j+2] = -1;
                    }
                }
            }
        }
        System.out.println(count);
    }
    /*private static boolean containsCake(int[][] arr, int i, int j) {
        if(i-2 >= 0 && arr[i-2][j] == 1){
            return true;
        }
        if(i+2 < arr.length && arr[i+2][j] == 1) {
            return true;
        }
        if(j-2 >= 0 && arr[i][j-2] == 1){
            return true;
        }
        if(j+2 < arr[i].length && arr[i][j+2] == 1) {
            return true;
        }
        return false;
    }*/
}
