/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -10 -20
 * Time: 16:52
 */
public class TestDemo2 {
    public static void move(char pos1,char pos2) {
        System.out.println(pos1 + "->" + pos2);
    }
    //pos1通过pos2移动到pos3上
    public static void Hanoi(int n,char pos1,char pos2,char pos3) {
        //如果只有一个盘子，利用move函数将pos1移动到pos3的位置上去
        if(n == 1) {
            move(pos1,pos3);
        }
        else {
            Hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            Hanoi(n-1,pos2,pos1,pos3);
        }

    }
    public static void main(String[] args) {
        //汉诺塔
        Hanoi(3,'A','B','C');
    }

}
