import com.bit.demo2.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -17
 * Time: 15:28
 */
public class TestDemo extends Animal {


    public  void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.display();
        Animal animal = new Animal();
        System.out.println(super.name);
       /* myLinkedList.remove(2);
        myLinkedList.display();*/


    }
}
