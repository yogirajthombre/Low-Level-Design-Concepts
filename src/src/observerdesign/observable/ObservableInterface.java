package observerdesign.observable;

import observerdesign.observer.Observer;

public interface ObservableInterface {
    /// Registers the Observer
    void add(Observer observer);

    /// Removes the Observer
    void remove(Observer observer);

    /// Notify the Observer
    void notifySubscriber();
}
