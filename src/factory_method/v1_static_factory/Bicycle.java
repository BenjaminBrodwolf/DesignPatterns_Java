package factory_method.v1_static_factory;

public class Bicycle extends Vehicle {

    public Bicycle() {
        this.type = "Bicycle";
    }

    public Bicycle(int speed) {
        super(speed);
        this.type = "Bicycle";
    }

    @Override
    public void print() {
        super.print();
    }
}
