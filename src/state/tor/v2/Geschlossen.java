package state.tor.v2;

public class Geschlossen extends AbstrakterZustand {

    public Geschlossen(Tor tor) {
        super(tor);
    }

    @Override
    public void oeffnen() {
        System.out.println("Tor wird geöffnet");
        TOR.setOeffenZustand();
    }

    @Override
    public void abschliessen() {
        System.out.println("Tor wird abgeschlossen");
        TOR.setAbgeschlossenZustand();
    }
}
