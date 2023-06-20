package observerdesign.observable;

import observerdesign.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface {
    public List<Observer> observerList = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
         for (Observer observer : observerList){
             observer.update(observer.user);
         }
    }

    public void setData(Observer observer,String userName){
        observer.user = userName;
        notifySubscriber();
    }
}
