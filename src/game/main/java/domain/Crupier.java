package domain;

import java.util.List;
import java.util.function.Function;

public class Crupier {
    private final Function<List<Card>, List<Card>> shuffleStrategy;
    private Deck deck;

    public Crupier(Deck deck, Function<List<Card>, List<Card>> shuffleStrategy) {
        this.deck = deck;
        this.shuffleStrategy = shuffleStrategy;
    }

    public void shuffle() {
        deck.shuffle(shuffleStrategy);
    }

    public void dealFlop(Table table) {
        List<Card> cards = deck.takeTopThree();

    }
}
