package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Deck {
    private List<Card> cards;

    public void shuffle(Function<List<Card>, List<Card>> shuffleStrategy) {
        cards = shuffleStrategy.apply(cards);
    }

    public List<Card> takeTopThree() {
        return new ArrayList<>(
                Arrays.asList(
                        takeTop(),
                        takeTop(),
                        takeTop()
                )
        );
    }

    public Card takeTop() {
        return cards.remove(0);
    }
}
