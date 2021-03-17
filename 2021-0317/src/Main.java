/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -17
 * Time: 23:21
 *//*

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            Map<Character,Integer> map1 = new TreeMap<>();
            Map<Character,Integer> map2 = new TreeMap<>();
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            for(int i = 0; i < ch1.length; i++) {
                map1.put(ch1[i] ,map1.get(ch1[i])+1);
            }
            for(int i = 0; i < ch2.length; i++) {
                map2.put(ch2[i] ,map2.get(ch2[i])+1);
            }
            for(Map.Entry<Character,Integer> entrySet : map2.entrySet()) {
                int len = map1.get(entrySet.getKey());
                if(len == 0) {
                    System.out.println("No");
                }else {
                    if(entrySet.getValue() > len) {
                        System.out.println("No");
                    }else {
                        System.out.println("Yes");
                    }
                }
            }
        }

    }
}*/

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            Map<Character,Integer> map1 = new TreeMap<>();
            Map<Character,Integer> map2 = new TreeMap<>();
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            for(int i = 0; i < ch1.length; i++) {
                map1.put(ch1[i] ,map1.getOrDefault(ch1[i],0)+1);
            }
            for(int i = 0; i < ch2.length; i++) {
                map2.put(ch2[i] ,map2.getOrDefault(ch2[i],0)+1);
            }
            for(Map.Entry<Character,Integer> entrySet : map2.entrySet()) {
                int len = map1.get(entrySet.getKey());
                if(len == 0) {
                    System.out.println("No");
                }else {
                    if(entrySet.getValue() > len) {
                        System.out.println("No");
                    }else {
                        System.out.println("Yes");
                    }
                }
            }
        }

    }
}
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            Boolean flag = true;
            Map<Character,Integer> map1 = new TreeMap<>();
            Map<Character,Integer> map2 = new TreeMap<>();
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            for(int i = 0; i < ch1.length; i++) {
                map1.put(ch1[i] ,map1.getOrDefault(ch1[i],0)+1);
            }
            for(int i = 0; i < ch2.length; i++) {
                map2.put(ch2[i] ,map2.getOrDefault(ch2[i],0)+1);
            }
            for(Map.Entry<Character,Integer> entrySet : map2.entrySet()) {
                int len = map1.get(entrySet.getKey());
                if(len == 0) {
                    flag = false;

                    break;
                }else {
                    if(entrySet.getValue() > len) {
                        flag = false;

                        break;
                    }
                }
            }
            if(flag) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
}
