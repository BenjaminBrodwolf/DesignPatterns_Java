package stateV2;

public class Bockig extends AbstrakteZustand {

    public Bockig(Freundin freundin) {
        super(freundin);
    }

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
