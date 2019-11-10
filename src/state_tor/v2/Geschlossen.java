package state_tor.v2;

public class Geschlossen extends AbstrakterZustand {

    public Geschlossen(Tor tor) {
        super(tor);
    }

    @Override
    public void oeffnen() {
        System.out.println("Tor wird geöffnet");
        TOR.setZustand(new Oeffen(TOR));
    }

    @Override
    public void abschliessen() {
        System.out.println("Tor wird abgeschlossenn");
        TOR.setZustand(new Abgeschlossen(TOR));
    }
}
