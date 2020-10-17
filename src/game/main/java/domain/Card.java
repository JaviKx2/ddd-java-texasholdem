package domain;

import java.util.Objects;

public final class Card {
    private final Suit suit;
    private final Integer number;

    public Card(Suit suit, Integer number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                Objects.equals(number, card.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }
}
