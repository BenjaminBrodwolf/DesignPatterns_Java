package state_tor.v5;

public final class TorZustande {

    public TorZustande(){}

    public final static Zustand OFFEN_ZUSTAND = new Offen();
    public final static Zustand GESCHLOSSEN_ZUSTAND = new Geschlossen();
    public final static Zustand ABGESCHLOSSEN_ZUSTAND = new Abgeschlossen();
}
