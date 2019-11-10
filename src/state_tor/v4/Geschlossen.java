package state_tor.v4;

public class Geschlossen extends AbstrakterZustand {

    @Override
    public Zustand oeffnen() {
        System.out.println("Tor wird geöffnet");
        return TorZustande.OFFEN_ZUSTAND;
    }

    @Override
    public Zustand abschliessen() {
        System.out.println("Tor wird abgeschlossen");
        return TorZustande.ABGESCHLOSSEN_ZUSTAND;
    }
}
