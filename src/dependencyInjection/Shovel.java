package dependencyInjection;

public class Shovel implements IDigable{

    @Override
    public void toDig() {
        System.out.println("Es wird mit der Schaufel gedigt.");
    }
}
