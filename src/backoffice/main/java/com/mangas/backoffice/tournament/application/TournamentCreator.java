package com.mangas.backoffice.tournament.application;

import com.mangas.backoffice.tournament.domain.*;

import java.math.BigDecimal;

public final class TournamentCreator {
    private final TournamentCreatorRepository repository;

    public TournamentCreator(TournamentCreatorRepository repository) {
        this.repository = repository;
    }

    public void create(Tournament tournament) {
        repository.save(tournament);
    }
}
