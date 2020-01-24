package dependencyInjection.digTools;

public class Shovel implements IDigable {

    @Override
    public void doDig() {
        System.out.println("Es wird mit der Schaufel gedigt.");
    }
}
