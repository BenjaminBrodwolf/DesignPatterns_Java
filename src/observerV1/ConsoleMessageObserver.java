package observerV1;

public class ConsoleMessageObserver implements Observer {

    @Override
    public void update(String value) {
        System.out.println("Newsletter wurde verschickt: " + value);
    }

}
