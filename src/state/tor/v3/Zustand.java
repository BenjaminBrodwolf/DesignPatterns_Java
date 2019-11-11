package state.tor.v3;

public interface Zustand {
    Zustand oeffnen();

    Zustand schliessen();

    Zustand abschliessen();

    Zustand aufschliessen();
}
