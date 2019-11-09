package stateV2;

public class Neutral extends AbstrakteZustand {

    public Neutral(Freundin freundin) {
        super(freundin);
    }

    public void unterhalten() {
        System.out.println("Hallo!");
    }
    public void kussGeben() {
        System.out.println("Hihi :-)");
        freundin.setAktuellerZustand(new Fröhlich(freundin)); //Zustandsübergang
    }
    public void verärgern() {
        System.out.println("Du spinnst wohl! Ich bin sauer! ;-(");
        freundin.setAktuellerZustand(new Bockig(freundin)); //Zustandsübergang
    }
}
