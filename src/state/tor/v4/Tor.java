package state.tor.v4;

public class Tor {

    private Zustand zustand = TorZustaende.OFFEN_ZUSTAND;

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
