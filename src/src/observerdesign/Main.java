package observerdesign;
import observerdesign.observable.Observable;
import observerdesign.observer.Observer;
public class Main {
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.add(new Observer("User1"));
        observable.add(new Observer("User2"));
        observable.add(new Observer("User3"));

        observable.setData(observable.observerList.get(0),"Yogiraj");
    }
}
