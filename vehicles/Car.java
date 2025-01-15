package prac5.vehicles;

public class Car extends Vehicle {

    public Car() {
        this.engineType = "Combustion";
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
