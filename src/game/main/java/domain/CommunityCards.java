package domain;

import java.util.List;

public class CommunityCards {
    private static final int FLOP_LIMIT = 3;
    private final List<Card> cards;

    public CommunityCards(List<Card> cards) {
        this.cards = cards;
    }

    public void setFlop(List<Card> cards) {
        if (this.cards.size() != 0) {
            throw new IllegalStateException();
        }
        if(cards.size() != FLOP_LIMIT) {
            throw new RuntimeException();
        }
        this.cards.addAll(cards);
    }
}
