package state_tor.v3;

public  abstract class AbstrakterZustand implements Zustand {

    protected Zustand OFFEN_ZUSTAND = new Offen();
    protected Zustand GESCHLOSSEN_ZUSTAND = new Geschlossen();
    protected Zustand ABGESCHLOSSEN_ZUSTAND = new Abgeschlossen();

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
