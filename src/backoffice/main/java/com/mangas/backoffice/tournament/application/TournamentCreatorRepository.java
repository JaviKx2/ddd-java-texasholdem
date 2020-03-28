package com.mangas.backoffice.tournament.application;

import com.mangas.backoffice.tournament.domain.Tournament;

public interface TournamentCreatorRepository {
    void save(Tournament tournament);
}
