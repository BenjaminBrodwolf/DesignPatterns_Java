package state.V1;

public class Neutral implements Zustand{

    //Konstruktur. Mit Freundin parametrisiert
    public Neutral(Freundin freundin){
        this.freundin = freundin;
    }

    //Referenz auf die Freundin
    private Freundin freundin;

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
