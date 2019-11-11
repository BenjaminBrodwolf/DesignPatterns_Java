package state.tor.v3;

public  abstract class AbstrakterZustand implements Zustand {

    protected final static Zustand OFFEN_ZUSTAND = new Offen();
    protected final static Zustand GESCHLOSSEN_ZUSTAND = new Geschlossen();
    protected final static Zustand ABGESCHLOSSEN_ZUSTAND = new Abgeschlossen();

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
