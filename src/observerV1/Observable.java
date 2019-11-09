package observerV1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable {

    private final List<Observer> observers = new CopyOnWriteArrayList<>();

    public void addSubscriber(Observer subscriber) {
        observers.add(subscriber);
    }

    public void removeListener(Observer subscriber) {
        observers.remove(subscriber);
    }

    public void notifyListeners(String value) {
        for (Observer s: observers) {
            s.update(value);
        }
    }
}
