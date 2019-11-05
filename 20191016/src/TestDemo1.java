//import java.util.Scanner;

import java.util.Scanner;
import java.util.Arrays;
public class TestDemo1 {
//    public static void main(String[] args) {
//        boolean ret = if_prime(7);
//        if(ret) {
//            System.out.println("是素数");
//        }else {
//            System.out.println("不是素数");
//        }
//    }
//
//    public static boolean if_prime(int num) {
//        int i = num/2;
//        for(int j=2; j<i; j++) {
//            //for(int j=2; j < Math.sqrt
//
//            if(num%j == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
  //  public static void main(String[] args) {
//        int a = 24;
//        int b = 18;
//        int yushu = a % b;
//        while(yushu != 0) {
//            a = b;
//            b = yushu;
//            yushu = a % b;
//        }
//        System.out.println(b);

//

    //求1-100中含有多少个9

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int ret = sum(num);
//        System.out.println(ret);
//    }
//    public static int sum(int n) {
//        int sum = 0;
//        for(int i=1; i <= n; i++) {
//            if(i%10 == 9) {
//                sum++;
//            }
//            if(i/10 == 9) {
//                sum++;
//            }
//        }
//        return sum;
//    }

//求出0~999999之间的所有水仙花数
//    public static void WaterFlower(int n) {
//        for(int i = 0; i <= n; i++) {
//            //求位数
//            int count = 0;
//            int tmp = i;
//            //定义一个tmp来表示i，因为经过while循环后，i的值会改变，但是后面还要用到i
//            while(tmp != 0) {
//                count++;//位数
//                tmp /= 10;
//            }//count里面保存的就是当前i的位数
//            tmp = i;
//            //求tmp的每一个位上的数字
//            //123   123%10=3  123/10 %10=2
//            //12/10%10=1   1/10=0
//            int sum = 0;
//            while(tmp != 0) {
//                sum += Math.pow(tmp%10,count);
//                tmp /= 10;
//            }
//            if( sum == i) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//       WaterFlower(num);
//    }
//    public static int[] transform(int[] array) {
//        int[] array2 = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            array2[i] = array[i] * 2;
//        }
//        return array2;
//    }
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = transform(array);
//        System.out.print(Arrays.toString(array));
//        System.out.println();
//        System.out.print(Arrays.toString(array2));
////        for (int i = 0; i < array.length; i++) {
////            System.out.print(array[i] + " ");
////        }
////        System.out.println();
////        for (int i = 0; i < array.length; i++) {
////            System.out.print(array2[i] + " ");
////        }
//    }

    //模拟实现toString的实现
    public static String toString(int[] array) {
      String str = "[";
      for(int i=0; i<array.length; i++) {
          str += array[i];
          if(i != array.length-1) {
            str += ",";
          }
      }
      str += "]";
      return str;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(toString(array));
    }

    //求数组当中的最大值,最小值，平均值,逆置
//    public static int max(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//    public static int min(int[] arr) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//    public static double ave(int[] arr) {
//        double sum = 0.0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum/arr.length;
//    }
//    //数组的逆置
//    public static int[] reverse(int[] arr) {
//        int left = 0;
//        int right =  arr.length-1;
//        int tmp = 0;
//        while(left < right) {
//            tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//        return arr;
//    }
//    //
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(max(arr));
//        System.out.println(min(arr));
//        System.out.println(ave(arr));
//        System.out.print(Arrays.toString(reverse(arr)));
//    }

    //二分查找的递归形式
 /*public static int binarySearch(int[] arr,int key,int left,int right) {
     if(left > right) {
         return -1;
     }
     int mid = (left + right)>>>1;
     if(arr[mid] == key) {
         return mid;
     }else if(arr[mid] < key) {
        return binarySearch(arr,key,mid+1,right);
     }else if(arr[mid] > key) {
         return binarySearch(arr,key,left,mid-1);
     }
 }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int ret = binarySearch(arr,7,1,9);
        System.out.println(ret);
    }*/


 //优化：
    public static void bubbleSort(int[] arr) {
        int tmp = 0;
        //趟数
        for(int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            //每趟比较的次数
            for(int j = 0; j < arr.length-1-i; j++) {
                flag = true;
                if(arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
     }
    public static void main(String[] args) {
        int[] arr = {1,3,7,9,2};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
