/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -11
 * Time: 16:28
 */
/*
兔子跳
        时间限制： 3000MS
        内存限制： 589824KB
        题目描述：
        一只兔子来到了图论森林游玩。图论森林可以被抽象地看作有n个点m条无向边的简单图，没有自环没有重边，
        兔子起始在1号点。兔子从一个点到另一个点的时候喜欢跳着走，先单脚跳一步，再双脚跳一步，如此循环，第一步是单脚跳。
        兔子在每次双脚跳之后会停下来观察这个点的风景。兔子最多可以观察到多少个点的风景。



        输入描述
        第一行两个数n和m。

        接下来m行，每行两个数u和v，表示两点之间有一条边。

        （1≤n≤100,000,  0≤m≤200,000）

        输出描述
        一个数表示兔子最多观察到的风景数。


        样例输入
        5 4
        1 5
        2 5
        3 5
        4 5
        样例输出
        4

        提示
        对于样例，每次兔子都可以单脚跳一步到5，再双脚跳一步到其他点。*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                //if(map.containsKey())
            }
        }*/
       /* ArrayList list = new ArrayList();
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2.removeLast());
        System.out.println(list2);*/
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       sc.nextLine();
       String str = sc.nextLine();
       System.out.println("嘿嘿");
    }
}











/*开关电灯
        时间限制： 3000MS
        内存限制： 589824KB
        题目描述：
        小A在宾馆打工。一日，小A需要把宾馆一个走廊上n个灯全部关掉。走廊上的灯编号为1~n。宾馆的电路有设计缺陷。
        宾馆的走廊上有n个开关，第i个开关只可以改变i~n号电灯的状态，即亮的熄灭，熄灭的变亮。
        小A一秒按一次开关，一共按了m次。给出小A每次按下的开关编号，请问每一盏灯第一次关掉的时间。一开始，所有灯都是亮着的。



        输入描述
        输入第一行包含两个数，n,m 接下来一行m个数，代表小A每次按下的开关编号

        （n,m≤100000,最后一次按下的开关一定是1号开关。）

        输出描述
        输出一行n个数，代表每盏电灯最后关掉的时间。


        样例输入
        4 2
        2 1
        样例输出
        2 1 1 1*/
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int[] time = new int[m];
            for(int i = 0; i < m; i++) {
                time[i] = sc.nextInt();
            }
            //用 Map 来实现对应关系

            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < m; i++) {
                int tmp = time[i];
                for(int j = tmp; j <= n; j++) {
                    if(map.get(j) == null) {
                        map.put(j,i+1);
                    }else {
                        break;
                    }
                }
            }
            for(int i = 1; i < n; i++) {
                System.out.printf(map.get(i) + " ");
            }
            System.out.println(map.get(n));
        }
    }
}
*/
