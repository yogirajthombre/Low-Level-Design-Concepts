package solid.liskovs;

public class Car implements EngineVehicle {
    @Override
    public boolean hasEngine() {
        return true;
    }
}
