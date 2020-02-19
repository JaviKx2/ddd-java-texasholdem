package com.mangas.game.tournament.application;

import com.mangas.game.tournament.domain.Tournament;

public interface TournamentCreatorRepository {
    void save(Tournament tournament);
}
