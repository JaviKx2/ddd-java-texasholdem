package com.mangas.backoffice.tournament.application;

import com.mangas.backoffice.tournament.domain.*;

import java.math.BigDecimal;

public final class TournamentCreator {
    private final TournamentCreatorRepository repository;

    public TournamentCreator(TournamentCreatorRepository repository) {
        this.repository = repository;
    }

    public void create(final String name, final String description, final BigDecimal buyIn, final int maxSize) {
        this.repository.save(
                new Tournament(
                        new TournamentName(name),
                        new TournamentDescription(description),
                        new TournamentBuyIn(buyIn),
                        new TournamentMaxSize(maxSize)
                )
        );
    }
}
