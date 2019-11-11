package state.freundin.v1;

public class Fröhlich implements Zustand {

    //Konstruktur. Mit Freundin parametrisiert
    public Fröhlich(Freundin freundin){
        this.freundin = freundin;
    }
    //Referenz auf die Freundin
    private Freundin freundin;

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
