package state.tor.v5;

public interface Zustand {
    Zustand oeffnen();

    Zustand schliessen();

    Zustand abschliessen();

    Zustand aufschliessen();
}
