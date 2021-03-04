/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -03
 * Time: 21:57
 *//*

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return list;
        }
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            // 最上面一行
            for(int col=left;col<=right;col++){
                list.add(matrix[up][col]);
            }
            // 向下逼近
            up++;
            // 判断是否越界
            if(up > down){
                break;
            }
            // 最右边一行
            for(int row=up;row<=down;row++){
                list.add(matrix[row][right]);
            }
            // 向左逼近
            right--;
            // 判断是否越界
            if(left > right){
                break;
            }
            // 最下面一行
            for(int col=right;col>=left;col--){
                list.add(matrix[down][col]);
            }
            // 向上逼近
            down--;
            // 判断是否越界
            if(up > down){
                break;
            }
            // 最左边一行
            for(int row=down;row>=up;row--){
                list.add(matrix[row][left]);
            }
            // 向右逼近
            left++;
            // 判断是否越界
            if(left > right){
                break;
            }
        }
        return list;
    }
}*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int len = matrix[0].length;
        int len2 = matrix.length;
        for(int i = 0; i < len2; i++) {
            for(int j = i; j < len-j; j++) {
                System.out.print(matrix[i][j]+",");
            }

        }
    }
}import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return list;
        }
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            // 最上面一行
            for(int col=left;col<=right;col++){
                list.add(matrix[up][col]);
            }
            // 向下逼近
            up++;
            // 判断是否越界
            if(up > down){
                break;
            }
            // 最右边一行
            for(int row=up;row<=down;row++){
                list.add(matrix[row][right]);
            }
            // 向左逼近
            right--;
            // 判断是否越界
            if(left > right){
                break;
            }
            // 最下面一行
            for(int col=right;col>=left;col--){
                list.add(matrix[down][col]);
            }
            // 向上逼近
            down--;
            // 判断是否越界
            if(up > down){
                break;
            }
            // 最左边一行
            for(int row=down;row>=up;row--){
                list.add(matrix[row][left]);
            }
            // 向右逼近
            left++;
            // 判断是否越界
            if(left > right){
                break;
            }
        }
        return list;
    }
}
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();
        if(matrix == null)return result;

        int low = 0;
        int high = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(low <= high && left <= right){

            //向右
            for(int i=left; i <= right; i++)
                result.add(matrix[low][i]);

            //向下
            for(int i = low+1; i <= high; i++)
                result.add(matrix[i][right]);

            //向左 有可能出现特殊的情况只有一行，为了避免重复访问
            if(low < high){
                for(int i= right-1; i >= left; i--)
                    result.add(matrix[high][i]);
            }

            //向上 有可能出现特殊的情况只有一列，为了避免重复访问
            if(left < right){
                for(int i = high-1; i >= low+1; i--)
                    result.add(matrix[i][left]);
            }

            low++;
            high--;
            left++;
            right--;
        }
        return result;
    }





