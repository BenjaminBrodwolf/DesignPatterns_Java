package composite.v1;

public abstract class Aufgabe {

    private final String beschreibung;

    public Aufgabe(String beschreibung){
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung(){
        return beschreibung;
    }

    public abstract void wirdErledigt();
    public abstract boolean istErledigt();
}
