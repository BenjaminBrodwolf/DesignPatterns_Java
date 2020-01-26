package composite.v1;

public class KompositumDemo {
    public static void main(String[] args) {

        AufgabenListe eana = new AufgabenListe("Eana");
        eana.add(new EinzelAufgabe("mündliche Prüfung"));


        AufgabenListe studium = new AufgabenListe("Studium");
        studium.add(eana);
        Aufgabe webfr = new EinzelAufgabe("Aufgaben lösen");
        Aufgabe iot = new EinzelAufgabe("Projekt");
        studium.add(webfr);
        studium.add(iot);


       studium.getChildren().forEach(aufgabe -> System.out.println(aufgabe.getBeschreibung()));
        System.out.println("Anzahl: " + studium.getAnzahlAufgaben());

    }


}
