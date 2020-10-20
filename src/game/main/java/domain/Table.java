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


    public void start() {
        while(!hasGameEnded()) {
            // TODO Start round / turn
            Round round = new Round();
            while(round.isRunning()){
                round.nextTurn();
                // TODO Ask for Player / User action
            }
        }
    }

    private boolean hasGameEnded() {
        // TODO Game ends when an unique player gathered all chips
        return true;
    }




}
