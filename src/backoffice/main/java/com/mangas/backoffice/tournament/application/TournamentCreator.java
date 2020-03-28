package com.mangas.backoffice.tournament.application;

import com.mangas.backoffice.tournament.domain.Tournament;
import com.mangas.backoffice.tournament.domain.TournamentCreatorRepository;

public final class TournamentCreator {
    private final TournamentCreatorRepository repository;

    public TournamentCreator(TournamentCreatorRepository repository) {
        this.repository = repository;
    }

    public void create(Tournament tournament) {
        repository.save(tournament);
    }
}
