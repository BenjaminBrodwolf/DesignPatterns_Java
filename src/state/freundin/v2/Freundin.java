package state.freundin.v2;

// Context
public class Freundin implements Zustand {

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
