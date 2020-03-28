package com.mangas.backoffice.tournament.domain;

import java.math.BigDecimal;

public class TournamentBuyInMother {
    public static TournamentBuyIn random(){
        return new TournamentBuyIn(BigDecimal.ZERO);
    }
}
