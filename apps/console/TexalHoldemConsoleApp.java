import domain.*;

import java.util.HashSet;

public class TexalHoldemConsoleApp {
    public static void main(String[] args) {
        new Table(
                new Crupier(cards -> cards),
                new HashSet<>(),
                new CommunityCards(),
                Deck.french()
        ).start();
    }
}
