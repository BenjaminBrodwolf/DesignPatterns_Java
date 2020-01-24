package command.v1;

public class GarageGateOpenCommand implements Command {
    private GarageGate garageGate;

    public GarageGateOpenCommand(GarageGate garageGate){
        this.garageGate = garageGate;
    }

    @Override
    public void execute() {
        garageGate.openGate();
    }
}
