package factory_method.v1_static_factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType) {
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
