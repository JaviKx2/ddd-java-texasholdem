package domain;

import java.util.List;
import java.util.function.Function;

public class Crupier {
    private final Function<List<Card>, List<Card>> shuffleStrategy;

    public Crupier(Function<List<Card>, List<Card>> shuffleStrategy) {
        this.shuffleStrategy = shuffleStrategy;
    }

    public void shuffle(Deck deck) {
        deck.shuffle(shuffleStrategy);
    }

    public void dealFlop(Deck deck, CommunityCards communityCards) {
        List<Card> cards = deck.takeTopThree();
        communityCards.setFlop(cards);
    }

    public void dealRiver(Deck deck, CommunityCards communityCards) {
        Card card = deck.takeTopOne();
        communityCards.setTurn(card);
    }

    public void dealTurn(Deck deck, CommunityCards communityCards) {
        Card card = deck.takeTopOne();
        communityCards.setRiver(card);
    }
}
