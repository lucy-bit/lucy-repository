import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -03 -26
 * Time: 18:48
 */
public class java20Test {
    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass________________");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass)))))))))))))))))))");
    }
    @After
    public void After() {
        System.out.println("*********************");
    }
    @Before
    public void Before() {
        System.out.println("$$$$$$$$$$$");
    }
    @Test
    public void add() {
        java20 a = new java20();
        int res = a.add(10,20);
        System.out.println(res);
    }

    public void insertSort(int[] arr) {
        //直接插入
        for(int i = 1; i < arr.length; i++) {
            int j = 0;
            int tmp = arr[i];
            for(j = i-1; j>=0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}