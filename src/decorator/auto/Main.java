package decorator.auto;

public class Main {
    public static void main(String[] args) {

        Car basicCarModelA = new Model_A();
        Car carWithAirCondition = new AirCondition(basicCarModelA);
        Car modelAWithSoundAndAirCon = new SoundSystem(carWithAirCondition);

        System.out.println("car: " + modelAWithSoundAndAirCon.getDescription()
                + " price: " + modelAWithSoundAndAirCon.getPrice());

        Car carExample = new Model_B();
        carExample = new SoundSystem(carExample);

        System.out.println("car: " + carExample.getDescription()
                + " price: " + carExample.getPrice());
    }
}
