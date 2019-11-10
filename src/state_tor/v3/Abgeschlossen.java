package state_tor.v3;

public class Abgeschlossen extends AbstrakterZustand {

    @Override
    public Zustand aufschliessen() {
        System.out.println("Tor wird aufgeschlossen");
        return GESCHLOSSEN_ZUSTAND;
    }
}
