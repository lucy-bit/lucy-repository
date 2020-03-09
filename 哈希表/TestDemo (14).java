/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-02-21
 * Time: 10:48
 */
public class TestDemo {
    public static void main(String[] args) {
        HashBucket hashBucket = new HashBucket();
        hashBucket.put(1,34);
        hashBucket.put(9,24);
        hashBucket.put(3,9);
        hashBucket.put(7,56);
        hashBucket.put(4,44);
        System.out.println("fdsafdsaf");
        System.out.println(hashBucket.getValue(9));
    }
}
