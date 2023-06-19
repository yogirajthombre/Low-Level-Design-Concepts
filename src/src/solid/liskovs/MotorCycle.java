package solid.liskovs;

public class MotorCycle implements EngineVehicle {
    @Override
    public boolean hasEngine() {
        return false;
    }
}
