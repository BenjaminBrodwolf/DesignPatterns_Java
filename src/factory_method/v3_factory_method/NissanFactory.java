package factory_method.v3_factory_method;

public class NissanFactory extends Garage {
    @Override
    protected Car createCar(String type) {
        Car car = null;
        if (type.equalsIgnoreCase("fast")) {
            car = new NissanFast();
        } else if (type.equalsIgnoreCase("medium")) {
            car = new NissanMedium();
        } else if (type.equalsIgnoreCase("slow")) {
            car = new NissanSlow();
        }
        return car;
    }

}
