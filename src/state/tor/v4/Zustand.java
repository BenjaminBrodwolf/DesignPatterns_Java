package state.tor.v4;

public interface Zustand {
    Zustand oeffnen();

    Zustand schliessen();

    Zustand abschliessen();

    Zustand aufschliessen();
}
