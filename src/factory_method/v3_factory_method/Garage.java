package factory_method.v3_factory_method;

//CREATOR
public abstract class Garage {
    public Car getCar(String type) {
        Car car = createCar(type);
        return car;
    }
    protected abstract Car createCar(String type);
}
