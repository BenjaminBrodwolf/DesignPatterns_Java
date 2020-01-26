package command.v3;

public class GarageGate {
    private boolean garageGate;  //Status of garage gate:
    private Light light;   //True equals open, False equals closed

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
