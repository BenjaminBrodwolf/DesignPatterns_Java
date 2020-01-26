package factory_method.v3_factory_method;

//CREATOR
public abstract class Garage {
    
    public Car getCar(String type) {
        Car car = createCar(type);
        return car;
    }

    //FACTORY METHOD, must be implemented in Factory classes
    protected abstract Car createCar(String type);
}
