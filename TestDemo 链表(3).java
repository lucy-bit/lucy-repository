/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-03
 * Time: 11:35
 */
public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addIndex(0,199);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(2);
        mySingleList.addLast(5);
        mySingleList.display();
        mySingleList.addIndex(0,2);
        mySingleList.display();
        mySingleList.addIndex(7,2);
        mySingleList.display();//99 199 1 2 3 4 5 999

        mySingleList.clear();
        System.out.println("fakfalls");

        /* mySingleList.removeAllKey(2);
        mySingleList.display();
       mySingleList.remove(99);
        System.out.println("删除99");
        mySingleList.display();//199 1 2 3 4 5 999
        mySingleList.remove(999);
        System.out.println("删除999");
        mySingleList.display();//199 1 2 3 4 5
        mySingleList.remove(2);
        System.out.println("删除2");
        mySingleList.display();//199 1 3 4 5*/

       /* boolean flg = mySingleList.contains1(99);
        System.out.println(flg);

        ListNode node = mySingleList.contains2(500);
        System.out.println(node.data);//5节点的地址*/
    }
}
