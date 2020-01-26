package singleton.early_instantiation;

public final class MySingleton {
    private static final MySingleton MY_SINGLETON = new MySingleton();
    private MySingleton(){ }
}


