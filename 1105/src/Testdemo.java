/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -11 -05
 * Time: 20:07
 */
public class Testdemo {
    public static void main(String[] args) {
        MysingleList mysingleList = new MysingleList();
        mysingleList.addLast(2);
        mysingleList.addLast(2);
        mysingleList.addLast(3);
        mysingleList.addLast(2);
        mysingleList.addLast(5);
        mysingleList.display();
        mysingleList.middleNode2();
        mysingleList.display2( mysingleList.middleNode2());
    }

}
