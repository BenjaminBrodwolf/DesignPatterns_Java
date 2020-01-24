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
