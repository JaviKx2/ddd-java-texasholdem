package domain;

import java.util.List;

public class CommunityCards {
    private final List<Card> cards;

    public CommunityCards(List<Card> cards) {
        this.cards = cards;
    }

    public void setFlop(List<Card> cards) {
        if (this.cards.size() != 0) {
            throw new IllegalStateException();
        }
        if(cards.size() != 3) {
            throw new RuntimeException();
        }
        this.cards.addAll(cards);
    }
}
