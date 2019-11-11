package composite.V2;

public class Student extends FHNW {


    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(" -> Student: " + getName());
    }

    @Override
    public int getAnzahlStudierente() {
        return 1;
    }

    //ggf. Instanzvariablen und weitere Methoden...
}
