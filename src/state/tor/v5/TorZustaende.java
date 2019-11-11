package state.tor.v5;

public final class TorZustaende {

    private final Zustand OFFEN_ZUSTAND = new Offen();
    private final Zustand GESCHLOSSEN_ZUSTAND = new Geschlossen();
    private final Zustand ABGESCHLOSSEN_ZUSTAND = new Abgeschlossen();

    private static TorZustaende torZustaende;

    private TorZustaende() {
    }

    public static TorZustaende getInstance() {
        if (torZustaende == null) {
            torZustaende = new TorZustaende();
        }

        return torZustaende;
    }

    public Zustand getOFFEN_ZUSTAND() {
        return OFFEN_ZUSTAND;
    }

    public Zustand getGESCHLOSSEN_ZUSTAND() {
        return GESCHLOSSEN_ZUSTAND;
    }

    public Zustand getABGESCHLOSSEN_ZUSTAND() {
        return ABGESCHLOSSEN_ZUSTAND;
    }
}
