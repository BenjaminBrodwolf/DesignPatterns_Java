package decorator.auto;

// concrete decorator
public class SoundSystem extends SpecialEquipment {

    protected SoundSystem(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return BASIS_Car.getPrice() + 10_000;
    }

    @Override
    public String getDescription() {
        return BASIS_Car.getDescription() + " und Soundsystem";
    }
}
