package prac5.app;

import prac5.vehicles.Car;
import prac5.vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota Camry");
        car.setLicense("A123BC");
        car.setColor("Черный");
        car.setYear(2018);
        car.setOwnerName("Иван Петров");
        car.setInsuranceNumber("INS123456");

        ElectricCar electricCar = new ElectricCar();
        electricCar.setModel("Tesla Model S");
        electricCar.setLicense("E456DE");
        electricCar.setColor("Белый");
        electricCar.setYear(2020);
        electricCar.setOwnerName("Анна Сидорова");
        electricCar.setInsuranceNumber("INS654321");
        electricCar.setBatteryCapacity(100500);

        car.setYear(2019);
        car.setOwnerName("Петр Иванов");

        electricCar.setInsuranceNumber("INS987654");

        int batteryCapacity = electricCar.getBatteryCapacity();
        System.out.println("Емкость батареи у электромобиля: " + batteryCapacity + " кВт·ч");

        System.out.println("\nИнформация о транспортных средствах:");
        System.out.println(car.toString());
        System.out.println();
        System.out.println(electricCar.toString());
    }
}
