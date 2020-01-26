package factory_method.v2_factory;

public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null) { return null; }
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        }
        if (vehicleType.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }
        if (vehicleType.equalsIgnoreCase("bicycle")) {
            return new Bicycle();
        }
        return null;
    }
}
