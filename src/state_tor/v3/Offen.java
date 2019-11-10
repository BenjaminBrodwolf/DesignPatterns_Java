package state_tor.v3;

public class Offen extends AbstrakterZustand {

    @Override
    public Zustand oeffnen() {
        System.out.println("Das Tor ist schon offen.");
        return this;
    }

    @Override
    public Zustand schliessen() {
        System.out.println("Tor wird geschlossen");
        return GESCHLOSSEN_ZUSTAND;
    }
}
