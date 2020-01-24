package decorator.auto;

// concrete component
public class Model_B implements Car {
    @Override
    public int getPrice() {
        return 40_000;
    }

    @Override
    public String getDescription() {
        return "Ein Wagen der Mittelklasse";
    }
}
