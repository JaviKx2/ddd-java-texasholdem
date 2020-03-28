package com.mangas.backoffice.tournament.domain;

public class TournamentId {
    private String id;

    public TournamentId(String id) {
        this.id = id;
    }

    public String value() {
        return id;
    }
}
