package observer.V3;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable obs) {
        Newsletter ns = (Newsletter) obs;
        String text = ns.getNewsText();
        System.out.println(name + " erhält: " + text);
    }

}
