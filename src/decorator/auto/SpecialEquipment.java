package decorator.auto;

// decorator
public abstract class SpecialEquipment implements Car {
    protected final Car BASIS_Car;

    protected SpecialEquipment(Car car) {
        this.BASIS_Car = car;
    }
}
