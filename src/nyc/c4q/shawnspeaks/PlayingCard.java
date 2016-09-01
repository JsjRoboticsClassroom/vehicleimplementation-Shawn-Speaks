package nyc.c4q.shawnspeaks;

/**
 * Created by shawnspeaks on 8/31/16.
 */
public class PlayingCard {
    Suit cardSuit;
    int value;

    public PlayingCard(Suit cardSuit, int value){
        this.cardSuit = cardSuit;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public enum Suit{
        DIAMOND, CLUB, HEART, SPADE
    }

}
