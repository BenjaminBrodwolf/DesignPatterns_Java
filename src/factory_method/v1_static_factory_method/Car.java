package factory_method.v1_static_factory_method;

public class Car extends Vehicle {

    public Car() {
        this.type = "Car";
    }

    public Car(int speed) {
        super(speed);
        this.type = "Car";
    }

    @Override
    public void print() {
        super.print();
    }
}
