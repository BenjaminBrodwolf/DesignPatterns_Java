package state.V1;

public class Bockig implements Zustand{

    //Konstruktur. Mit Freundin parametrisiert
    public Bockig(Freundin freundin){
        this.freundin = freundin;
    }
    //Referenz auf die Freundin
    private Freundin freundin;

    public void unterhalten() {
        System.out.println("Fahr jetzt nach Hause! Ich will nicht mit dir reden!");
    }
    public void kussGeben() {
        System.out.println("Na gut! Hab dich wieder lieb.");
        freundin.setAktuellerZustand(new Neutral(freundin)); //Zustandsübergang
    }
    public void verärgern() {
        System.out.println("Du machst alles bloß noch schlimmer!");
    }
}
