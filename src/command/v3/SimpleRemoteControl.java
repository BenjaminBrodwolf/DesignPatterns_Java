package command.v3;

import java.util.Stack;

public class SimpleRemoteControl {
    private Stack<Command> stack;
    private Stack<Command> undoStack;

    public SimpleRemoteControl(){
        stack = new Stack<>();
        undoStack = new Stack<>();
    }

    public void setCommand(Command command){
        stack.push(command);
    }

    public void buttonPressed(){
        undoStack.push(stack.peek());
        stack.pop().execute();
        System.out.println("Command executed :)");
    }

    public void performUndo(){
        if(!undoStack.empty()){
            undoStack.pop().undo();
            System.out.println("Command undone!");
        } else {
            System.out.println("Nothing to be undone");
        }
    }
}
