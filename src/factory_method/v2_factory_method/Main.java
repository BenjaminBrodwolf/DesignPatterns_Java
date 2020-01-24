package factory_method.v2_factory_method;

public class Main {
    public static void main(String[] args) {

        //must create VehicleFactory to use later
        VehicleFactory vf = new VehicleFactory();

        //create Car and print type and speed
        Vehicle car = vf.createVehicle("car");
        car.setSpeed(100);
        car.print();

        //create Motorcycle and print type and speed
        Vehicle motorcycle = vf.createVehicle("motorcycle");
        motorcycle.setSpeed(80);
        motorcycle.print();

        System.out.println(car.getClass());
        System.out.println(motorcycle.getClass());
    }
}
