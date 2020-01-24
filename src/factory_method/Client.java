public class Client {
    public static void main(String[] args) {

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
