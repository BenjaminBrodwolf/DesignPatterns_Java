package state_tor.v3;

public class Oeffen extends AbstrakterZustand {

    @Override
    public Zustand schliessen() {
        System.out.println("Tor wird geschlossen");
        return GESCHLOSSEN_ZUSTAND;
    }
}
