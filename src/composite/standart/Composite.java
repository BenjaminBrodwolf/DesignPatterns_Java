package composite.standart;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    //hier: Components als Liste vorgehalten
    private List<Component> childComponents = new ArrayList<>();

    //rekursiver Aufruf auf kindComponents, ggf. hinzufügen von eigener Logik
    @Override
    public void operation() {
        System.out.println("Ich bin ein Composite. Meine Kinder sind:");
        for (Component childComps : childComponents) {
            childComps.operation();
        }
    }

    //Überschreiben der Defaulimplementierung
    public void add(Component comp) {
        childComponents.add(comp);
    }

    public void remove(Component comp) {
        childComponents.remove(comp);
    }

    public Component getChild(int index) {
        return childComponents.get(index);
    }

}
