package prac5.vehicles;

public class ElectricCar extends Car implements ElectricVehicle {

    private int batteryCapacity;

    public ElectricCar() {
        this.engineType = "Electric";
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tЕмкость батареи: " + this.getBatteryCapacity() + " кВт·ч";
    }
}
