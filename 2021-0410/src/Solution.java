/*
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String str = "abdbfbg";
        System.out.println(FirstNotRepeatingChar(str));
    }
    public static int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0) {
            return -1;
        }
        */
/*int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        for(int i = 0; i < str.length(); i++) {
            if(arr[str.charAt(i)] == 1) {
                return i;
            }
        }*//*

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}*/

import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) {
            return 0;
        }
        // 1. HashMap
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        int len = array.length / 2;
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet()) {
            if(entrySet.getValue() > len) {
                return entrySet.getKey();
            }
        }
        return 0;
    }
}
