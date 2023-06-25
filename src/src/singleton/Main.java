package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample example = SingletonExample.getInstance();
        SingletonExample example1 = SingletonExample.getInstance();
        System.out.println(example);
        System.out.println(example1);
    }
}
