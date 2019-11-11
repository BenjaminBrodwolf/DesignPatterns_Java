package state.tor.v5;

public class Main {

    public static void main(String[] args) {
        Tor tor = new Tor();

        tor.schliessen();
        tor.abschliessen();
        tor.aufschliessen();
        tor.oeffnen();
        tor.oeffnen();
    }
}
