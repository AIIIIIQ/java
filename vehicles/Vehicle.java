package prac5.vehicles;

public abstract class Vehicle {

    private String model, license, color, ownerName;
    private int year;
    private String insuranceNumber;
    protected String engineType;

    public abstract String vehicleType();

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Тип: " + this.vehicleType() +
                "\n\tМодель: " + this.getModel() +
                "\n\tНомерной знак: " + this.getLicense() +
                "\n\tЦвет: " + this.getColor() +
                "\n\tГод: " + this.getYear() +
                "\n\tВладелец: " + this.getOwnerName() +
                "\n\tНомер страховки: " + this.getInsuranceNumber() +
                "\n\tТип двигателя: " + this.getEngineType();
    }
}
