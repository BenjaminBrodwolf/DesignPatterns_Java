package state.V2;

public abstract class AbstrakteZustand implements Zustand{

    protected Freundin freundin;

    public AbstrakteZustand(Freundin freundin){
        this.freundin = freundin;
    }

    @Override
    public void unterhalten() {
        throw new IllegalStateException();
    }

    @Override
    public void kussGeben() {
        throw new IllegalStateException();

    }

    @Override
    public void verärgern() {
        throw new IllegalStateException();
    }

}
