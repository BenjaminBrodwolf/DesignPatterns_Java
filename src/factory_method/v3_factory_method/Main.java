package factory_method.v3_factory_method;

public class Main {
    public static void main(String[] args) {

        Garage toyotaGarage = new ToyotaFactory();
        Car toyotaCar = toyotaGarage.getCar("fast");
        toyotaCar.print();

        Garage nissanGarage = new NissanFactory();
        Car nissanCar = nissanGarage.getCar("medium");
        nissanCar.print();
    }
}
