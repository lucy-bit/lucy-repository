/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -12 -07
 * Time: 19:28
 */

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            for(int i = 0; i < n; i++) {
                System.out.print(ch);
            }
            for(int j = 0; j < (int)(n/2.0 + 0.5) - 2 ; j++) {
                System.out.println();
                System.out.print(ch);
                for(int i = 0; i < n-2; i++) {
                    System.out.print(" ");
                }
                System.out.print(ch);
            }
            System.out.println();
            for(int i = 0; i < n; i++) {
                System.out.print(ch);
            }
        }
    }
}*/



import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            BigInteger s1 = new BigInteger(addend);
            BigInteger s2 = new BigInteger(augend);
            System.out.println(s1.add(s2));
        }
    }

}
