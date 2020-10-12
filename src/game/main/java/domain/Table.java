package domain;

import java.util.Set;

public class Table {
    private Crupier crupier;
    private Set<Player> players;
    private CommunityCards communityCards;

    public Table(Crupier crupier, Set<Player> players, CommunityCards communityCards) {
        this.crupier = crupier;
        this.players = players;
        this.communityCards = communityCards;
    }


}
