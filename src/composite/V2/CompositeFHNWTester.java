package composite.V2;

public class CompositeFHNWTester {

    public static void main(String[] args) {

        Modul eana = new Modul("Eana");
        eana.add(new Student("Pascal"));
        eana.add(new Student("Nadia"));
        eana.add(new Student("Kevin"));
        eana.add(new Student("Felix"));

        eana.print();


        Modul depa = new Modul("Depa");
        depa.add(new Student("Jan"));
        depa.add(new Student("Nico"));
        depa.add(new Student("Benjamin"));

        depa.print();


        System.out.println("\n ---- ALLE MODULE ZUSAMMEN ---- ");

        Modul fhnw = new Modul("FHNW");
        fhnw.add(depa);
        fhnw.add(eana);

        fhnw.print();


    }
}
