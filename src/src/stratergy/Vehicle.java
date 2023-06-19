package stratergy;

public class Vehicle {
    Drive drive;
    public Vehicle(Drive drive){
        this.drive = drive;
    }
    public void drive() {
        drive.drive();
    }

}
