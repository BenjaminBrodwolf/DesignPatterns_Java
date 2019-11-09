package observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers = new ArrayList<>();

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
