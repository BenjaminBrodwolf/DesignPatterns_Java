package composite.standart;

public class CompositeStandartTester {

    public static void main(String[] args) {
        /*
         * Struktur aufbauen
         */
        Composite rootComposite = new Composite();
        rootComposite.add(new Leaf());
        rootComposite.add(new Leaf());

        Composite otherComposite = new Composite();
        rootComposite.add(otherComposite);

        otherComposite.add(new Leaf());
        otherComposite.add(new Leaf());
        otherComposite.add(new Leaf());

        /*
         * Einfache Nutzung der Struktur
         */
        rootComposite.operation();
    }

}
