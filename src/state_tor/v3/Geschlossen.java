package state_tor.v3;

public class Geschlossen extends AbstrakterZustand {

    @Override
    public Zustand oeffnen() {
        System.out.println("Tor wird geöffnet");
        return OFFEN_ZUSTAND;
    }

    @Override
    public Zustand abschliessen() {
        System.out.println("Tor wird abgeschlossen");
        return ABGESCHLOSSEN_ZUSTAND;
    }
}
