package com.mangas.backoffice.tournament.application;

import com.mangas.backoffice.tournament.domain.*;

import java.math.BigDecimal;

public class TournamentCreator {
    private TournamentCreatorRepository repository;

    public TournamentCreator(TournamentCreatorRepository repository) {
        this.repository = repository;
    }

    public void create(String name, String description, BigDecimal buyIn, int maxSize) {
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
