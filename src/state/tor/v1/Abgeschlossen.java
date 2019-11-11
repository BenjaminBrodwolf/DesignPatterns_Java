package state.tor.v1;

public class Abgeschlossen extends AbstrakterZustand {

    public Abgeschlossen(Tor tor) {
        super(tor);
    }

    @Override
    public void aufschliessen() {
        System.out.println("Tor wird aufgeschlossen");
        TOR.setZustand(new Geschlossen(TOR));
    }
}
