package solid.liskovs;

public class Bicycle implements Vehicle{

    @Override
    public Integer numberOfWheels() {
        return 2;
    }
}
