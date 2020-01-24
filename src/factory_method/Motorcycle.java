public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.type = "Motorcycle";
    }

    public Motorcycle(int speed) {
        super(speed);
        this.type = "Motorcycle";
    }

    @Override
    public void print() {
        super.print();
    }
}
