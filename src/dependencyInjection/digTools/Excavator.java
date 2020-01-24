package dependencyInjection.digTools;

public class Excavator implements IDigable {
    @Override
    public void doDig() {
        System.out.println("Es wird mit dem Bagger gedigt");
    }
}
