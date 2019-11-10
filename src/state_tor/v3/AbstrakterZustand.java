package state_tor.v3;

public class AbstrakterZustand implements Zustand {

    protected final Zustand OFFEN_ZUSTAND = new Oeffen();
    protected final Zustand GESCHLOSSEN_ZUSTAND = new Geschlossen();
    protected final Zustand ABGESCHLOSSEN_ZUSTAND = new Abgeschlossen();

    @Override
    public Zustand oeffnen() {
        throw new IllegalStateException();
    }

    @Override
    public Zustand schliessen() {
        throw new IllegalStateException();
    }

    @Override
    public Zustand abschliessen() {
        throw new IllegalStateException();
    }

    @Override
    public Zustand aufschliessen() {
        throw new IllegalStateException();
    }
}
