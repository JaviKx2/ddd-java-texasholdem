import domain.Crupier;
import domain.Table;

public class TexalHoldemConsoleApp {
    public static void main(String[] args) {
        new Table(
                new Crupier(null),
                null,
                null,
                null
        );
    }
}
