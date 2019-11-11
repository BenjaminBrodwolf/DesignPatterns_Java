package composite.standart;

public abstract class Component {
    //gemeinsame Methode
    public abstract void operation();

    public void add(Component comp){
        //Leere Defaultimplementierung.
        //Für Leafs nicht sinnvoll.
        //Werden nur von Composites überschrieben.
    }

    public void remove(Component comp){
        //Leere Defaultimplementierung.
    }

    public Component getChild(int index){
        //Leere Defaultimplementierung.
        return null;
    }

}
