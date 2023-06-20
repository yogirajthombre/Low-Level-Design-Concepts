package observerdesign.observer;

public class Observer implements ObserverInterface {
    public String user;
    public Observer(String user){
        this.user = user;
    }
    @Override
    public void update(String userName) {
        System.out.println("Update is called" + userName);
    }
}
