package observer1;

public class ConsoleMessageObserver implements Observer {

//    IObservable observable;

//    public ConsoleMessageObserver(Newsletter newsletter) {
//        this.observable = newsletter;
//    }


    @Override
    public void update(String value) {
//        Newsletter newsletter = (Newsletter) source;
        System.out.println("Newsletter wurde verschickt: " + value);
    }

//    @Override
//    public void update() {
//        Newsletter newsletter = (Newsletter) observable;
//        System.out.println("Newsletter wurde verschickt: " + newsletter.getNews());
//    }
}
