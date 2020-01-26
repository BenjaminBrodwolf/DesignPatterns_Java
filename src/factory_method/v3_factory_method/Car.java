package factory_method.v3_factory_method;

//PRODUCT
public abstract class Car {

    protected String model;
    protected int speed;

    public void print() {
        System.out.println("Model: " + model + " Max Speed: " + speed);
    }
}
