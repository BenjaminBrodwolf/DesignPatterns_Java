package composite.v1;

public class KompositumDemo {
    public static void main(String[] args) {

        AufgabenListe eana = new AufgabenListe("Eana");
        eana.add(new EinzelAufgabe("mündliche Prüfung"));
        eana.add(new EinzelAufgabe("Aufgaben lösen"));
        eana.add(new EinzelAufgabe("Note aufbessern"));

        AufgabenListe studium = new AufgabenListe("Studium");
        studium.add(eana);
        Aufgabe webfr = new EinzelAufgabe("Aufgaben lösen");
        Aufgabe iot = new EinzelAufgabe("Projekt");
        studium.add(webfr);
        studium.add(iot);

//        anzeigen("alles fertig?", studium);
//        eana.wirdErledigt();
//        anzeigen("Jetzt alles fertig?", studium);
//        anzeigen("Eana fertig?", eana);
//        webfr.wirdErledigt();
//        iot.wirdErledigt();
//        anzeigen("Fertig?", studium);
//
//        System.out.println("Aufgaben insgesamt: " + studium.getAnzahlAufgaben());

       studium.getChildren().forEach(aufgabe -> System.out.println(aufgabe.getBeschreibung()));
    }

    private static void anzeigen(String text, Aufgabe aufgabe){
        System.out.println(text);
        System.out.println(" --> " + aufgabe.getBeschreibung() + " ist "
            + (aufgabe.istErledigt() ? "" : "noch nicht ")
            + "erledigt.");
        System.out.println();
    }
}
