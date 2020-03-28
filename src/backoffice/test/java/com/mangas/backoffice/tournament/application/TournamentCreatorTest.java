package com.mangas.backoffice.tournament.application;

import com.mangas.backoffice.tournament.domain.Tournament;
import com.mangas.backoffice.tournament.domain.TournamentMother;
import com.mangas.backoffice.tournament.infrastructure.InMemoryTournamentCreatorRepository;

public class TournamentCreatorTest {

    public void shouldCreateTournament() {
        Tournament tournament = TournamentMother.random();
        new TournamentCreator(
                new InMemoryTournamentCreatorRepository()
        ).create(tournament);
    }
}
