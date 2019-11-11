package observer.v2;

public interface Observer<T> {
    void update(T value);
}
