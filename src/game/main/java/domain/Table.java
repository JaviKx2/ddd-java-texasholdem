package domain;

import java.util.Set;

public class Table {
    private Crupier crupier;
    private Set<Player> players;
    private CommunityCards communityCards;
    private Deck deck;

    public Table(Crupier crupier, Set<Player> players, CommunityCards communityCards, Deck deck) {
        this.crupier = crupier;
        this.players = players;
        this.communityCards = communityCards;
        this.deck = deck;
    }

    public void setFlop() {
        crupier.dealFlop(deck, communityCards);
    }


}
