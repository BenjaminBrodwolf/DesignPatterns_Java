package state_tor.v4;

public class Tor {

    private final Zustand startZustande = new Offen();

    private Zustand zustand = startZustande;


    public void oeffnen() {
        this.zustand = zustand.oeffnen();
    }

    public void schliessen() {
        this.zustand = zustand.schliessen();
    }

    public void abschliessen() {
        this.zustand = zustand.abschliessen();
    }

    public void aufschliessen() {
        this.zustand = zustand.aufschliessen();
    }

}
