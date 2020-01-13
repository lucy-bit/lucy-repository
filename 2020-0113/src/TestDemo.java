/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -01 -13
 * Time: 11:15
 */
public class TestDemo {
    public static void insertSort(int[] array) {
       /* int i = 1;
        int j = i-1;
        while() {
            int tmp = array[i];
            if(array[j] > tmp) {
                tmp = array[j];
                array[j+1] = tmp;

            }
        }*/
       for(int i = 1; i < array.length; i++) {
           int tmp = array[i];
           int j = 0;
           for(j = i-1; j >= 0; j--) {
               if(array[j] > tmp) {
                   array[j+1] = array[j];
               }else {
                   break;
               }
           }
           array[j+1] = tmp;
       }
    }
    public static void shellSort(int[] array,int gap) {
       for(int i = gap; i < array.length; i++) {
           int tmp = array[i];
           int j = 0;
           for(j = i - gap; j >= 0; j -= gap) {
               if(array[j] > tmp) {
                   array[j + gap] = array[j];
               }else {
                   break;
               }
           }
           array[j+gap] = tmp;
       }
    }
    public static void selectSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void bubbleSort(int[] array) {
        boolean flag = false;
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(!false) {
                break;
            }
        }
    }
    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while(start <end) {

        }
    }
}
