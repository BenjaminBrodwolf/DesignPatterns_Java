package state.tor.v1;

public class Oeffen extends AbstrakterZustand {

    public Oeffen(Tor tor) {
        super(tor);
    }

    @Override
    public void schliessen() {
        System.out.println("Tor wird geschlossen");
        TOR.setZustand(new Geschlossen(TOR));
    }
}
