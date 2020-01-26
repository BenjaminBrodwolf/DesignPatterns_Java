package factory_method.v3_factory_method;

//CONCRETE CREATOR
public class ToyotaFactory extends Garage {

    @Override
    protected Car createCar(String type) {
        Car car = null;
        if (type.equalsIgnoreCase("fast")) {
            car = new ToyotaFast();
        } else if (type.equalsIgnoreCase("medium")) {
            car = new NissanMedium();
        } else if (type.equalsIgnoreCase("slow")) {
            car = new NissanSlow();
        }
        return car;
    }
}
