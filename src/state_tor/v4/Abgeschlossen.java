package state_tor.v4;

public class Abgeschlossen extends AbstrakterZustand {

    @Override
    public Zustand aufschliessen() {
        System.out.println("Tor wird aufgeschlossen");
        return TorZustande.GESCHLOSSEN_ZUSTAND;
    }
}
