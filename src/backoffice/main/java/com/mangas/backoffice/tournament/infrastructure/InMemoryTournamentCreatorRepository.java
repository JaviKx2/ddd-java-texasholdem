package com.mangas.backoffice.tournament.infrastructure;

import com.mangas.backoffice.tournament.domain.TournamentCreatorRepository;
import com.mangas.backoffice.tournament.domain.Tournament;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTournamentCreatorRepository implements TournamentCreatorRepository {
    private List<Tournament> tournaments;

    public InMemoryTournamentCreatorRepository() {
        tournaments = new ArrayList<>();
    }

    @Override
    public void save(Tournament tournament) {
        this.tournaments.add(tournament);
    }
}
