import javax.smartcardio.Card;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -08
 * Time: 17:12
 */
class card {
    public int rank;
    public String suit;

    @Override
    public String toString() {
        return "card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}

public class CardDemo {
    //定义花色
    public static final String[] SUITS = {"♠", "♥", "♣", "♦"};
    //买牌
    private static List<Card> buyPuke() {
        List<Card> deck = new
    }
}
