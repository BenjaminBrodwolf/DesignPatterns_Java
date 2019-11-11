package composite.v2;

public class AtomarerMitarbeiter extends Mitarbeiter {


    //Hinweis: der Stringparameter dient lediglich der Einrückung
    public void print(String abstand) {
        System.out.println(abstand + getName() + ". Tel: " + getTelefonNr());
    }

    /*
     * Restlicher Code:
     */
    //Konstruktor
    public AtomarerMitarbeiter(String name, int telefonNr) {
        super(name, telefonNr);
    }
    //der Rest ist bekannt
    public int getMitarbeiterAnzahl() {
        return 1;
    }
}
