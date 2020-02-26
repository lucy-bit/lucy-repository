/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -02 -21
 * Time: 10:50
 */
public class HashBucket {
    static class Node {
        private int key;
        private int value;
        private Node next;
        public Node(int key,int value) {
            this.key = key;
            this.value = value;
        }

        private Node[] array = new Node[7];
        private int size;

        public int getValue(int key) {
            //拿到合法下标
            int index = key % array.length;
            //遍历array[index]下标的链表，找到值为key的数据，并且返回
           while(array[index] != null) {
               if(array[index].value == key) {
                   return key;
               }else {
                   array[index] = array[index].next;
               }
           }
        }
    }
}
