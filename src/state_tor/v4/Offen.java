package state_tor.v4;

public class Offen extends AbstrakterZustand {

    public Zustand oeffnen() {
        System.out.println("Das Tor ist schon offen.");
        return this;
    }

    @Override
    public Zustand schliessen() {
        System.out.println("Tor wird geschlossen");
        return TorZustande.GESCHLOSSEN_ZUSTAND;
    }
}
