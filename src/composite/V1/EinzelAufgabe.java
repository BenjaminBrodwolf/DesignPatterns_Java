package composite.V1;

public class EinzelAufgabe extends Aufgabe {

    private boolean erledigt;

    public EinzelAufgabe(String beschreibung){
        super(beschreibung);
    }

    @Override
    public void wirdErledigt() {
        this.erledigt = true;
        System.out.println("Teilaufgabe " + getBeschreibung() + " soeben erledigt.");
    }

    @Override
    public boolean istErledigt() {
        return erledigt;
    }
}
