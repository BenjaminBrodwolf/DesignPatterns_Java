package decorator.auto;

// concrete decorator
public class AirCondition extends SpecialEquipment {
    public AirCondition(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return BASIS_Car.getPrice() + 8_000;
    }

    @Override
    public String getDescription() {
        return BASIS_Car.getDescription() + " und Klimaanlage";
    }
}
