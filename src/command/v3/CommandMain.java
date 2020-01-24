package command.v3;

public class CommandMain {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light(false);
        LightOnCommand lightOn = new LightOnCommand(light);
        System.out.println("Light initialised with status: " + light.getStatus());

        GarageGate garageGate = new GarageGate(false, light);
        GarageGateOpenCommand gateOpen = new GarageGateOpenCommand(garageGate);
        System.out.println("Garage gate initialised with status: " + garageGate.getState());

        remote.setCommand(lightOn);
        remote.buttonPressed();
        System.out.println("Light status is: " + light.getStatusAsString());
        remote.setCommand(gateOpen);
        remote.buttonPressed();
        System.out.println(garageGate.getState());
        remote.setCommand(lightOn);
        for (int i = 0; i < 3; i++) {
            remote.performUndo();
            System.out.println(garageGate.getState());
        }
    }
}
