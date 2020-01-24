package decorator.auto;

public class Main {
    public static void main(String[] args) {

        Car basicCarModelA = new Model_A();
        Car airCondition = new AirCondition(basicCarModelA);
        Car modelAWithSoundAndAirCon = new SoundSystem(airCondition);

        System.out.println("Kundenwunsch: " + modelAWithSoundAndAirCon.getDescription()
                + " Preis: " + modelAWithSoundAndAirCon.getPrice());


        Car basicCarModelB = new Model_B();
        Car modelBWithSoundSystem = new SoundSystem(basicCarModelB);

        System.out.println("Kundenwunsch: " + modelBWithSoundSystem.getDescription()
                + " Preis: " + modelBWithSoundSystem.getPrice());
    }
}
