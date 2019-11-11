package observer.V3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable {

    private List<Observer> observers = new CopyOnWriteArrayList<>();

    public void addSubscriber(Observer subscriber) {
        observers.add(subscriber);
    }

    public void removeListener(Observer subscriber) {
        observers.remove(subscriber);
    }

    public void notifyListeners() {
        for (Observer s: observers) {
            s.update(this);
        }
    }
}
