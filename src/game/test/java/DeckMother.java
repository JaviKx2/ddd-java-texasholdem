import domain.Card;
import domain.Suit;

import java.util.Arrays;
import java.util.List;

public class DeckMother {

    public static List<Card> validFrenchDeck() {
        return Arrays.asList(
                new Card(Suit.CLUBS, 1),
                new Card(Suit.CLUBS, 2),
                new Card(Suit.CLUBS, 3),
                new Card(Suit.CLUBS, 4),
                new Card(Suit.CLUBS, 5),
                new Card(Suit.CLUBS, 6),
                new Card(Suit.CLUBS, 7),
                new Card(Suit.CLUBS, 8),
                new Card(Suit.CLUBS, 9),
                new Card(Suit.CLUBS, 10),
                new Card(Suit.CLUBS, 11),
                new Card(Suit.CLUBS, 12),
                new Card(Suit.CLUBS, 13),
                new Card(Suit.DIAMONDS, 1),
                new Card(Suit.DIAMONDS, 2),
                new Card(Suit.DIAMONDS, 3),
                new Card(Suit.DIAMONDS, 4),
                new Card(Suit.DIAMONDS, 5),
                new Card(Suit.DIAMONDS, 6),
                new Card(Suit.DIAMONDS, 7),
                new Card(Suit.DIAMONDS, 8),
                new Card(Suit.DIAMONDS, 9),
                new Card(Suit.DIAMONDS, 10),
                new Card(Suit.DIAMONDS, 11),
                new Card(Suit.DIAMONDS, 12),
                new Card(Suit.DIAMONDS, 13),
                new Card(Suit.HEARTS, 1),
                new Card(Suit.HEARTS, 2),
                new Card(Suit.HEARTS, 3),
                new Card(Suit.HEARTS, 4),
                new Card(Suit.HEARTS, 5),
                new Card(Suit.HEARTS, 6),
                new Card(Suit.HEARTS, 7),
                new Card(Suit.HEARTS, 8),
                new Card(Suit.HEARTS, 9),
                new Card(Suit.HEARTS, 10),
                new Card(Suit.HEARTS, 11),
                new Card(Suit.HEARTS, 12),
                new Card(Suit.HEARTS, 13),
                new Card(Suit.SPADES, 1),
                new Card(Suit.SPADES, 2),
                new Card(Suit.SPADES, 3),
                new Card(Suit.SPADES, 4),
                new Card(Suit.SPADES, 5),
                new Card(Suit.SPADES, 6),
                new Card(Suit.SPADES, 7),
                new Card(Suit.SPADES, 8),
                new Card(Suit.SPADES, 9),
                new Card(Suit.SPADES, 10),
                new Card(Suit.SPADES, 11),
                new Card(Suit.SPADES, 12),
                new Card(Suit.SPADES, 13)
        );
    }
}
