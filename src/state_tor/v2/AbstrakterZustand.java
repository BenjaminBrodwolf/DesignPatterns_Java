package state_tor.v2;

public abstract class AbstrakterZustand implements Zustand {

    public final Tor TOR;

    public AbstrakterZustand(Tor tor){
        this.TOR = tor;
    }

    @Override
    public void oeffnen() {
        throw new IllegalStateException();
    }

    @Override
    public void schliessen() {
        throw new IllegalStateException();
    }

    @Override
    public void abschliessen() {
        throw new IllegalStateException();
    }

    @Override
    public void aufschliessen() {
        throw new IllegalStateException();
    }
}
