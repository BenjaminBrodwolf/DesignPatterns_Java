package factory_method.v1_static_factory;

public class Main {
    public static void main(String[] args) {

        //can directly use VehicleFactory.createVehicle() method since it is static
        //create Car and print type and speed
        Vehicle car = VehicleFactory.createVehicle("car");
        car.setSpeed(100);
        car.print();

        //create Motorcycle and print type and speed
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.setSpeed(80);
        motorcycle.print();

        System.out.println(car.getClass());
        System.out.println(motorcycle.getClass());
    }
}
