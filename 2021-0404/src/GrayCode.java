/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2021 -04 -04
 * Time: 23:53
 */
import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        //递归思想
        //要求n位格雷码，要通过n-1位的格雷码，求出n-1位的格雷码后，前面加“0”作为前半部分，前面加“1”再反转作为后半部分
        if(n == 1) {
            return new String[]{"0","1"};
        }else {
            String[] str = getGray(n-1);
            String[] ret = new String[str.length*2];
            for(int i = 0; i < str.length; i++) {
                ret[i] = "0" + str[i];
                ret[ret.length-1-i] = "1" + str[i];
            }
            return ret;
        }
    }
}