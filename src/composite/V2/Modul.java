package composite.V2;

import java.util.ArrayList;
import java.util.List;

public class Modul extends FHNW {

    private List<FHNW> studenten = new ArrayList<>();

    public Modul(String modulName) {
        super(modulName);
    }

    @Override
    public void print() {
        System.out.println("Modul " + getName() + " hat " + getAnzahlStudierente() + " Studenten.");
        for (FHNW student: studenten) {
            student.print();
        }
    }

    //rekursiver Aufruf auf alle Studenten und erhalte die Anzahl der Studierente in diesem Modul
    @Override
    public int getAnzahlStudierente() {
        int summe = 0;
        for (FHNW student : studenten) {
            summe += student.getAnzahlStudierente();
        }
        return summe;
    }

    //Überschreiben der Defaulimplementierung
    public void add(FHNW student) {
        studenten.add(student);
    }

    public void remove(FHNW student) {
        studenten.remove(student);
    }

    public FHNW getStudent(int index) {
        return studenten.get(index);
    }

}
