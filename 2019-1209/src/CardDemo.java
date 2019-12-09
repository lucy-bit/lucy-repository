import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2019 -12 -09
 * Time: 14:57
 */
class Card {
    public String suit;
    public int rank;
    public Card(String suit,int rank) {
        this.suit = suit;
        this.rank =rank;
    }

    @Override
    public String toString() {
        return String.format("[%s %d]", suit, rank);
    }
}
public class CardDemo {
    public String[] suits = {"♥","♦",
            "♣","♠"};
    //买牌
    //不设置为静态的是因为在下边还要用到suits，静态方法内部不能实例化对象
    public  List<Card> buyPuke() {
        List<Card> deck = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j <= 13; j++) {
                String suit = suits[i];
                Card card = new Card(suit,j);
                deck.add(card);
            }
        }
        return deck;
    }

    //洗牌
    private void swap(List<Card> deck,int start,int end) {
        Card tmp = deck.get(start);
        deck.set(start,deck.get(end));
        deck.set(end,tmp);
    }
    public void shuffle(List<Card> deck) {
        Random random = new Random();
        for(int i = deck.size() -1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(deck,i,index);
        }
    }
    //发牌
    public List<List<Card>> catchCard(List<Card> deck) {
        //定义一个二位数组hands，里面存放的每个人，一维数组里存放的是每个人手里的牌
        List<List<Card>> hands = new ArrayList<>();
        List<Card> human1 = new ArrayList<>();
        List<Card> human2 = new ArrayList<>();
        List<Card> human3 = new ArrayList<>();
        //human里存放每个人
        hands.add(human1);
        hands.add(human2);
        hands.add(human3);
        //抓牌
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                hands.get(i).add(deck.remove(0));
            }
        }
        return hands;
    }
}
