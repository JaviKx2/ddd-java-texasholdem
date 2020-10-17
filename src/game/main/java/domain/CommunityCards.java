package domain;

import java.util.List;

public class CommunityCards {
    private static final int FLOP_LIMIT = 3;
    private static final int TURN_INCL_LIMIT = FLOP_LIMIT + 1;
    private final List<Card> cards;

    public CommunityCards(List<Card> cards) {
        this.cards = cards;
    }

    public void setFlop(List<Card> flopCards) {
        if (cards.size() != 0) {
            throw new IllegalStateException();
        }
        if (flopCards.size() != FLOP_LIMIT) {
            throw new RuntimeException();
        }
        cards.addAll(flopCards);
    }

    public void setRiver(Card card) {
        if (cards.size() != TURN_INCL_LIMIT) {
            throw new IllegalStateException();
        }
        cards.add(card);
    }

    public void setTurn(Card card) {
        if (cards.size() != FLOP_LIMIT) {
            throw new IllegalStateException();
        }
        cards.add(card);
    }
}
