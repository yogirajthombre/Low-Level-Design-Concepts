package solid;

//// Breaks the behavior of bike
public class Cycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {
        throw new AssertionError("there is no acceleration");
    }
}
