package composite.v2;

import java.util.ArrayList;
import java.util.List;

public class Abteilungsleiter extends Mitarbeiter {
    //Hinweis: der Stringparameter dient lediglich der Einrückung
    public void print(String abstand) {
        System.out.println(abstand + "Abteilungsleiter " + getName() + " (" + getAbteilung() + "). Tel: " + getTelefonNr());
        for (Mitarbeiter ma : mitarbeiter) {
            ma.print(abstand + "      ");//Einrückung
        }
    }

    /*
     * Restlicher Code:
     */
    private List<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
    private String abteilung;

    public String getAbteilung() {
        return abteilung;
    }
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
    //Konstruktor
    public Abteilungsleiter(String name, String abteilung, int telefonNr) {
        super(name, telefonNr);
        this.abteilung = abteilung;
    }
    //Der Rest ist bekannt
    public int getMitarbeiterAnzahl() {
        int summe = 1; //1 für sich selbst
        for (Mitarbeiter ma : mitarbeiter) {
            summe += ma.getMitarbeiterAnzahl();
        }
        return summe;
    }
    //Verwaltungsmethoden...
    public void add(Mitarbeiter ma) {
        mitarbeiter.add(ma);
    }

    public void remove(Mitarbeiter ma) {
        mitarbeiter.remove(ma);
    }

    public Mitarbeiter getMitarbeiter(int index) {
        return mitarbeiter.get(index);
    }


}
