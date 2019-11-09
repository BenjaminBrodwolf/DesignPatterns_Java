package observerV1;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String value) {
        System.out.println(name + " erhält: " + value);
    }

}
