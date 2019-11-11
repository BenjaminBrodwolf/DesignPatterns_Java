package observer.v2;

public class Subscriber implements Observer<String> {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String value) {
        System.out.println(name + " erhält: " + value);
    }

}
