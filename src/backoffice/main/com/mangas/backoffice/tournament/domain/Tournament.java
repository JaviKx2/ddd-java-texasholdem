package com.mangas.backoffice.tournament.domain;

public class Tournament {
    private TournamentName name;
    private TournamentDescription description;
    private TournamentBuyIn buyIn;
    private TournamentMaxSize maxSize;

    public Tournament(TournamentName name, TournamentDescription description, TournamentBuyIn buyIn, TournamentMaxSize maxSize) {
        this.name = name;
        this.description = description;
        this.buyIn = buyIn;
        this.maxSize = maxSize;
    }
}
