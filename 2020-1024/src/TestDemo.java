import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -10 -24
 * Time: 16:19
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
    public static void main2(String[] args) {
        //PriorityQueue 当中 最小的元素 优先级更高一些
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//容量默认是11
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(14);//容量是14
        priorityQueue.offer(4);
        priorityQueue.offer(1);
        priorityQueue.offer(8);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.peek());
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(12);
        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println("===================================================");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
