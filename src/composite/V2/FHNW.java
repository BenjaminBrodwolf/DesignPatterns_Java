package composite.V2;
// Component
public abstract class FHNW {

    public abstract void print();

    //gemeinsame Methode
    public abstract int getAnzahlStudierente();

    private String name;

    public FHNW(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
