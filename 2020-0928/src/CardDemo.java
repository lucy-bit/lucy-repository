import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86187
 * Date: 2020 -09 -28
 * Time: 21:26
 */
class Card {
    public String suit;
    public int rank;

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
public class CardDemo {
    //练习扑克牌
    public static final String[] suits = {"♥","♠","♦","♣"};
    public static List<Card> buyDesc() {
        List<Card> list = new ArrayList<>();
        for(int i = 0; i < suits.length; i++) {
            //i下标代表花色
            for(int j = 1; j <= 13; j++) {
                Card card = new Card(suits[i],j);
                list.add(card);
            }
        }
        return list;

    }

    //洗牌
    private static void swap(List<Card> list,int index,int i) {
        Card tmp = list.get(index);
        list.set(index,list.get(i));
        list.set(i,tmp);
    }
    public static void shuffle(List<Card> list) {
        Random random = new Random();
        for(int i = list.size()-1; i >0; i--) {
            int index = random.nextInt(i);//获取【0 i)的任意随机值
            swap(list,index,i);
        }
    }

    //揭牌
    public static void takeCard(List<Card> list) {
        //也就是将牌从list中删除，增加到hands中
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        List<List<Card>> hand = new ArrayList<>();
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);
        //给三个人每人发五张牌
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                hand.get(j).add(list.remove(0));
            }
        }
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
    }
    public static void main(String[] args) {
        List<Card> list = buyDesc();
        System.out.println("买了一副牌 " + list);
        shuffle(list);
        System.out.println("洗牌后 " + list);
        takeCard(list);

    }
}
