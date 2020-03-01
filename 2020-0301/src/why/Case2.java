package why;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -03 -01
 * Time: 11:19
 */
public class Case2 {
    static class FibThread extends Thread {
        int n;

        FibThread(int n) {
            this.n = n;
        }

        public void run() {
            System.out.println("fib(%d) = %d%n",n,fib(n));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入要计算的数：");
            int n = sc.nextInt();
            sc.nextLine();
            new FibThread(n).start();
        }
        start.println(int long = 0)
    }
}
