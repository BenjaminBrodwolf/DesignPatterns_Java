package composite.v1;

import composite.V2.FHNW;

import java.util.ArrayList;
import java.util.List;

public class AufgabenListe extends Aufgabe{

    private List<Aufgabe> aufgaben;

    public AufgabenListe(String beschreibung){
        super(beschreibung);
        aufgaben = new ArrayList<>();
    }

    @Override
    public void wirdErledigt() {
        for(Aufgabe aufgabe : aufgaben){
            aufgabe.wirdErledigt();
        }
    }

    @Override
    public boolean istErledigt() {
        for(Aufgabe aufgabe : aufgaben){
            if (!aufgabe.istErledigt()){
                return false;
            }
        }
        return true;
    }

    //rekursiver Aufruf auf alle Studenten und erhalte die Anzahl der Studierente in diesem Modul
    @Override
    public int getAnzahlAufgaben() {
        int summe = 0;
        for (Aufgabe aufgabe : aufgaben) {
            summe += aufgabe.getAnzahlAufgaben();
        }
        return summe;
    }

    public void hinzufuegen(Aufgabe aufgabe){
        aufgaben.add(aufgabe);
    }


}
