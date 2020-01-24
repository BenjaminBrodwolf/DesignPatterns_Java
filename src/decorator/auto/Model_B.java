package decorator.auto;

public class Model_B implements Component {
    @Override
    public int getPrice() {
        return 40_000;
    }

    @Override
    public String getDescription() {
        return "Ein Wagen der Mittelklasse";
    }
}
