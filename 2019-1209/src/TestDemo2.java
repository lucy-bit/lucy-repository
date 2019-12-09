import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -09
 * Time: 14:57
 */
public class TestDemo2 {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> list = cardDemo.buyPuke();
        System.out.println(list);

        cardDemo.shuffle(list);
        System.out.println(list);

        List<List<Card>> deck = cardDemo.catchCard(list);
        for (List<Card> ret : deck) {
            System.out.println(ret);
        }

    }


}
