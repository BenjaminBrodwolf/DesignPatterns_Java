package factory_method.v1_static_factory;

public abstract class Vehicle {

    protected String type;
    protected int speed;

    protected Vehicle() {
    }

    protected Vehicle(int speed) {
        this.speed = speed;
    }

    protected void print() {
        System.out.println(type + " " + speed);
    }

    protected String getType() {
        return type;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }
}
