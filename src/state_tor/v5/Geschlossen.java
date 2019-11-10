package state_tor.v5;

public class Geschlossen extends AbstrakterZustand {

    @Override
    public Zustand oeffnen() {
        System.out.println("Tor wird geöffnet");
        return torZustaende.getOFFEN_ZUSTAND();
    }

    @Override
    public Zustand abschliessen() {
        System.out.println("Tor wird abgeschlossen");
        return torZustaende.getABGESCHLOSSEN_ZUSTAND();
    }
}
