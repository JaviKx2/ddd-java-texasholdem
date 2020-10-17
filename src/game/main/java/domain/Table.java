package domain;

import java.util.Set;

public final class Table {
    private final Crupier crupier;
    private final Set<Player> players;
    private final CommunityCards communityCards;
    private final Deck deck;

    public Table(Crupier crupier, Set<Player> players, CommunityCards communityCards, Deck deck) {
        this.crupier = crupier;
        this.players = players;
        this.communityCards = communityCards;
        this.deck = deck;
    }

    public void deal() {
        crupier.dealNext(deck, communityCards);
    }


}
