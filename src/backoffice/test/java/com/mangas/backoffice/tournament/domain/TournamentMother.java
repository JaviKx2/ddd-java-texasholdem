package com.mangas.backoffice.tournament.domain;

public class TournamentMother {
    public static Tournament random() {
        return new Tournament(
                TournamentIdMother.random(),
                TournamentNameMother.random(),
                TournamentDescriptionMother.random(),
                TournamentBuyInMother.random(),
                TournamentMaxSizeMother.random()

        );
    }
}
