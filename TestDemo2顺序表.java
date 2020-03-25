/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-10-26
 * Time: 15:29
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,3);
        myArrayList.add(2,6);
        myArrayList.add(2,61);
        myArrayList.add(2,56);
        myArrayList.add(0,23);
        myArrayList.display();// 23 12 3 56 61 6
        myArrayList.remove(23);
        myArrayList.display();
        myArrayList.remove(6);
        myArrayList.display();
        myArrayList.remove(56);
        myArrayList.display();
        System.out.println("清空");
        myArrayList.clear();
        myArrayList.display();
        /*MyArrayList myArrayList2 = new MyArrayList();
        MyArrayList myArrayList3 = new MyArrayList();
        MyArrayList myArrayList4 = new MyArrayList();
        MyArrayList myArrayList5 = new MyArrayList();*/

    }
}
