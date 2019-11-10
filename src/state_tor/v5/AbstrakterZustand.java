package state_tor.v5;

public  abstract class AbstrakterZustand implements Zustand {

    TorZustande torZustande;

    public AbstrakterZustand(){
        if (null == torZustande){
            torZustande = new TorZustande();
        }
    }

    @Override
    public Zustand oeffnen() {
        throw new IllegalStateException();
    }

    @Override
    public Zustand schliessen() {
        throw new IllegalStateException();
    }

    @Override
    public Zustand abschliessen() {
        throw new IllegalStateException();
    }

    @Override
    public Zustand aufschliessen() {
        throw new IllegalStateException();
    }
}
