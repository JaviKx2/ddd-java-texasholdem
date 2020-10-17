package domain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Deck {
    private List<Card> cards;

    public void shuffle(Function<List<Card>, List<Card>> shuffleStrategy) {
        cards = shuffleStrategy.apply(cards);
    }

    public List<Card> takeTopThree() {
        return Arrays.asList(takeTopOne(), takeTopOne(), takeTopOne());
    }

    public Card takeTopOne() {
        return cards.remove(0);
    }
}
