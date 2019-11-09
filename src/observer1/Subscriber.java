package observer1;

public class Subscriber implements Observer {

    private String name;
//    private Newsletter newsletter;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String value) {
        System.out.println(name + " erhält: " + value);
    }

//    @Override
//    public void update() {
//        System.out.println(name + " erhält: " + newsletter.getNews());
//    }
}
