package com.mangas.backoffice.tournament.domain;

public class Tournament {
    private TournamentId id;
    private TournamentName name;
    private TournamentDescription description;
    private TournamentBuyIn buyIn;
    private TournamentMaxSize maxSize;

    public Tournament(TournamentId id, TournamentName name, TournamentDescription description, TournamentBuyIn buyIn, TournamentMaxSize maxSize) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.buyIn = buyIn;
        this.maxSize = maxSize;
    }
}
