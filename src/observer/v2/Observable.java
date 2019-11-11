package observer.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void addSubscriber(Observer subscriber) {
        observers.add(subscriber);
    }

    public void removeListener(Observer subscriber) {
        observers.remove(subscriber);
    }

    public void notifyListeners(T value) {
        for (Observer s: observers) {
            s.update(value );
        }
    }
}
