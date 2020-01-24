package dependencyInjection;

public class Master {

    public void commando(IDigable digTool){
        Worker worker = new Worker();
        worker.DigHole(digTool);
    }
}
