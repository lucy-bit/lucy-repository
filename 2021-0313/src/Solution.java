/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -13
 * Time: 23:44
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int count = 0;
        int[][] arr = new int[W][H];
        //一种方法：遍历所有盒子，若距该盒子的上下左右2距离长的任意盒子里有蛋糕，该格子不能放蛋糕
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {

                if(!containsCake(arr,i,j)) {
                    arr[i][j] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    private static boolean containsCake(int[][] arr, int i, int j) {
        if(i-2 >= 0 && arr[i-2][j] == 1){
            return true;
        }
        if(i+2 < arr[i].length && arr[i+2][j] == 1) {
            return true;
        }
        if(j-2 >= 0 && arr[i][j-2] == 1){
            return true;
        }
        if(j+2 < arr.length && arr[i][j+2] == 1) {
            return true;
        }
        return false;
    }
}