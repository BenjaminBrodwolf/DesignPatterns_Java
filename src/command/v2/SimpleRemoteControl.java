package command.v2;

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

    public void performUndo(){
        System.out.println("Command undone!");
        this.stack.undo();
    }
}
