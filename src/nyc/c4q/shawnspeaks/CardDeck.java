package nyc.c4q.shawnspeaks;

/**
 * Created by shawnspeaks on 8/31/16.
 */
public class CardDeck {
    private PlayingCard[] cards = new PlayingCard[52];

    public CardDeck(){
        PlayingCard card;
       for (PlayingCard.Suit cardSuit : PlayingCard.Suit.values()) {
           int i = 0;
           while (i < 13) {
               i++;
               System.out.println("Suit is: " + cardSuit + " Value of: " + i);
               card = new PlayingCard(cardSuit, i);
               cards[i - 1] = card;
           }
       }
    }

}
