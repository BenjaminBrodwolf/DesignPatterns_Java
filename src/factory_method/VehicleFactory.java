public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null) { return null; }
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        } else if (vehicleType.equalsIgnoreCase("bicycle")) {
            return new Bicycle();
        }
        return null;
    }
}
