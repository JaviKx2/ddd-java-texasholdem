package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Deck {
    private List<Card> cards;

    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    public static Deck french() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(suit, i));
            }
        }
        return new Deck(cards);
    }

    public void shuffle(Function<List<Card>, List<Card>> shuffleStrategy) {
        cards = shuffleStrategy.apply(cards);
    }

    public List<Card> takeTopThree() {
        return Arrays.asList(takeTopOne(), takeTopOne(), takeTopOne());
    }

    public Card takeTopOne() {
        return cards.remove(0);
    }

    public List<Card> cards() {
        return cards;
    }
}
