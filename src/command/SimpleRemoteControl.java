package command;

public class SimpleRemoteControl {
    private Command stack;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        this.stack = command;
    }

    public void buttonPressed(){
        System.out.println("Command executed :)");
        this.stack.execute();
    }
}
