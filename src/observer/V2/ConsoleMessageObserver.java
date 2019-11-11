package observer.V2;

public class ConsoleMessageObserver implements Observer<String> {

    @Override
    public void update(String value) {
        System.out.println("Newsletter wurde verschickt: " + value);
    }

}
