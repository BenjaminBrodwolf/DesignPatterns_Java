package state.V2;

public class Fröhlich extends AbstrakteZustand{

    public Fröhlich(Freundin freundin) {
        super(freundin);
    }

    public void unterhalten() {
        System.out.println("Hihi, mir gehts super!");
    }
    public void kussGeben() {
        System.out.println("Hihi, :-D");
    }
    public void verärgern() {
        System.out.println("Du spinnst wohl! ;-(");
        freundin.setAktuellerZustand(new Bockig(freundin)); //Zustandsübergang
    }
}
