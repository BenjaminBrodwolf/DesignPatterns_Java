package observer.v3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable {

    private List<Observer> observers = new CopyOnWriteArrayList<>();

    public void addSub(Observer sub) {
        observers.add(sub);
    }

    public void removeSub(Observer sub) {
        observers.remove(sub);
    }

    public void notifyListeners() {
        for (Observer s: observers) {
            s.update(this);
        }
    }
}
