package command.v1;

public class Light {
    private boolean status; //Light status: True equals ON, False equals OFF

    public Light(boolean state){
        this.status = state;
    }

    public boolean getStatus(){
        return status;
    }

    public String getStatusAsString(){
        String result;
        if(status){
            result = "Light is on";
        } else {
            result = "Light is off";
        }
        return result;
    }

    public void lightOn(){
        status = true;
    }

    public void lightOff(){
        status = false;
    }
}
