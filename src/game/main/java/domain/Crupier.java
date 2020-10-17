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

    private void dealFlop(Deck deck, CommunityCards communityCards) {
        List<Card> cards = deck.takeTopThree();
        communityCards.setFlop(cards);
    }

    private void dealRiver(Deck deck, CommunityCards communityCards) {
        Card card = deck.takeTopOne();
        communityCards.setTurn(card);
    }

    private void dealTurn(Deck deck, CommunityCards communityCards) {
        Card card = deck.takeTopOne();
        communityCards.setRiver(card);
    }

    public void dealNext(Deck deck, CommunityCards communityCards) {
        if (communityCards.isFlopDealt()) {
            dealTurn(deck, communityCards);
        } else if(communityCards.isTurnDealt()){
            dealRiver(deck, communityCards);
        } else {
            dealFlop(deck, communityCards);
        }
    }
}
