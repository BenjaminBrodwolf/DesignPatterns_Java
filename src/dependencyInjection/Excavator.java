package dependencyInjection;

public class Excavator implements IDigable {
    @Override
    public void toDig() {
        System.out.println("Es wird mit dem Bagger gedigt");
    }
}
