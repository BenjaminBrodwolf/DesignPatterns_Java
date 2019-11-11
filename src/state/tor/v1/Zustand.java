package state.tor.v1;

public interface Zustand {
    void oeffnen();
    void schliessen();
    void abschliessen();
    void aufschliessen();
}
