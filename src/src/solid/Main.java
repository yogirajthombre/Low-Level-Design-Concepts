package solid;

import solid.liskovs.*;
import solid.liskovs.MotorCycle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EngineVehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new MotorCycle());
        // vehicleList.add(new Bicycle());
        for (EngineVehicle vh : vehicleList){
            System.out.println(vh.hasEngine());
        }
    }
}