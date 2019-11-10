package state_tor.v5;

public interface Zustand {
    Zustand oeffnen();

    Zustand schliessen();

    Zustand abschliessen();

    Zustand aufschliessen();
}
