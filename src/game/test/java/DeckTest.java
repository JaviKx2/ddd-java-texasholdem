import domain.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class DeckTest {

    @Test
    void itShouldReturnAValidFrenchDeck() {
        Deck deck = Deck.french();
        assertTrue(deck.cards().containsAll(DeckMother.validFrenchDeck()));
    }
}
