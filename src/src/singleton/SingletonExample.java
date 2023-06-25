package singleton;

public class SingletonExample {

    public static volatile SingletonExample instance = null;

    public static SingletonExample getInstance() {
        if (instance == null) {
            /// Making safe for different threads to be accessible
            synchronized (SingletonExample.class){
                if (instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }
}
