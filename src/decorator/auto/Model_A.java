package decorator.auto;

// concrete component
public class Model_A implements Car {
    @Override
    public int getPrice() {
        return 100_000;
    }

    @Override
    public String getDescription() {
        return "A luxury car";
    }
}
