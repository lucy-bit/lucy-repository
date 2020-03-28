import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-08
 * Time: 16:35
 */
class Card {
    public String suit;
    public int rank;
    public Card(String suit,int rank) {
        this.suit = suit;
        this.rank =  rank;
    }
    @Override
    public String toString() {
        return String.format("[%s %d]", suit, rank);
    }
}

public class CardDemo {
    public static final String[] suits = {"♥","♦",
    "♣","♠"};

    public List<Card> buyPuke() {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i <  4 ; i++) {
            for (int j = 1; j <= 13 ; j++) {
                String suit = suits[i];
                //int rank = j;
                Card card = new Card(suit,j);
                deck.add(card);
            }
        }
        return deck;
    }

    private void swap(List<Card> deck,int start,int end) {
        Card tmp = deck.get(start);
        deck.set(start,deck.get(end));
        deck.set(end,tmp);
    }

    public void shuffle(List<Card> deck) {
        Random random = new Random(20191208);
        for (int i = deck.size()-1; i > 0 ; i--) {
            int index = random.nextInt(i);//[0,i)
            swap(deck,i,index);
        }
    }

}
