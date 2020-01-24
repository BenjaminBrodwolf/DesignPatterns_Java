package command.v2;

public class GarageGateOpenCommand implements Command {
    private GarageGate garageGate;

    public GarageGateOpenCommand(GarageGate garageGate) {
        this.garageGate = garageGate;
    }

    @Override
    public void execute() {
        garageGate.openGate();
    }

    @Override
    public void undo() {
        garageGate.closeGate();
    }
}
