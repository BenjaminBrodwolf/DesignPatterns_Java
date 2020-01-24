package command.v3;

public class GarageGate {
    private boolean garageGate;     //Status of garage gate: True equals open, False equals closed
    private Light light;

    public GarageGate(boolean status, Light light){
        this.garageGate = status;
        this.light = light;
    }

    public void openGate(){
        garageGate = true;
    }

    public void closeGate(){
        garageGate = false;
    }

    public String getState(){
        String result = "Garage gate is ";
        if(garageGate){
            result += "opened and ";
        } else {
            result += "closed and ";
        }
        result += light.getStatusAsString();
        return result;
    }
}
