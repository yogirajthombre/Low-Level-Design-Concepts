package observerdesign.observer;

public class DataObserver implements ObserverInterface{
    @Override
    public void update(String name) {
        System.out.println("Update is called");
    }
}
