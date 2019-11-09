package observerV3;

public class ConsoleMessageObserver implements Observer {

    @Override
    public void update(Observable obs) {
        Newsletter ns = (Newsletter) obs;
        String text = ns.getNewsText();
        System.out.println("Newsletter wurde verschickt: " + text);
    }

}
