package decorator.auto;

public class Main {
    public static void main(String[] args) {

        Component basicCarModelA = new Model_A();
        Component airCondition = new AirCondition(basicCarModelA);
        Component modelAWithSoundAndAirCon = new SoundSystem(airCondition);

        System.out.println("Kundenwunsch: " + modelAWithSoundAndAirCon.getDescription()
                + " Preis: " + modelAWithSoundAndAirCon.getPrice());


        Component basicCarModelB = new Model_B();
        Component modelBWithSoundSystem = new SoundSystem(basicCarModelB);

        System.out.println("Kundenwunsch: " + modelBWithSoundSystem.getDescription()
                + " Preis: " + modelBWithSoundSystem.getPrice());
    }
}
