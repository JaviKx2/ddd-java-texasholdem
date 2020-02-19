package game.main.com.mangas.game.tournament.application;

import game.main.com.mangas.game.tournament.domain.Tournament;

public interface TournamentCreatorRepository {
    void save(Tournament tournament);
}
