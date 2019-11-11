package state.freundin.v1;

// Context
public class Freundin{

    private Zustand aktuellerZustand;

    //Defaultzustand Neutral im Konstruktor setzen.
    public Freundin(){
        setAktuellerZustand(new Neutral(this));
    }

    void setAktuellerZustand(Zustand zustand){
        this.aktuellerZustand = zustand;
    }

    public void unterhalten() {
        aktuellerZustand.unterhalten();
    }

    public void kussGeben() {
        aktuellerZustand.kussGeben();
    }

    public void verärgern() {
        aktuellerZustand.verärgern();
    }

}
