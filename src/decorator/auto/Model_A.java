package decorator.auto;

public class Model_A implements Component {
    @Override
    public int getPrice() {
        return 100_000;
    }

    @Override
    public String getDescription() {
        return "Ein Wagen der Luxusklasse";
    }
}
