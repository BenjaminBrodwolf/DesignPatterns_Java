package state.tor.v4;

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
