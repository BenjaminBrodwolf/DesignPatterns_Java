package singleton.lazy_instantiation.not_thread_safe;

public class MySingleton {
    private static volatile MySingleton instance;

    private MySingleton() { }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}

