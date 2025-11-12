package inheritance;

import java.time.LocalDate;

public class Vehicle {
    private String title;
    private String listingId;
    private double price;
    private String city;
    private String condition;
    private LocalDate lastModified;
    private String make;
    private String model;
    private String registrationNumber;
    private double mileage;
    private String engine;
    private int modelYear;
    private String transmission;
    private boolean automatic;
    private String driveType;
    private boolean fourWheelDrive;
    private double officeFee;
    private LocalDate inspectionDate;
    private String bodyStyle;
    private String vehicleType;
    private String color;
    private String vinNumber;

    public Vehicle(String title, String listingId, double price, String city, String condition, LocalDate lastModified,
            String make, String model, String registrationNumber, double mileage, String engine, int modelYear,
            String transmission, boolean automatic, String driveType, boolean fourWheelDrive, double officeFee,
            LocalDate inspectionDate, String bodyStyle, String vehicleType, String color, String vinNumber) {

        this.title = title;
        this.listingId = listingId;
        this.price = price;
        this.city = city;
        this.condition = condition;
        this.lastModified = lastModified;
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
        this.engine = engine;
        this.modelYear = modelYear;
        this.transmission = transmission;
        this.automatic = automatic;
        this.driveType = driveType;
        this.fourWheelDrive = fourWheelDrive;
        this.officeFee = officeFee;
        this.inspectionDate = inspectionDate;
        this.bodyStyle = bodyStyle;
        this.vehicleType = vehicleType;
        this.color = color;
        this.vinNumber = vinNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getListingId() {
        return listingId;
    }

    public double getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public String getCondition() {
        return condition;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getMileage() {
        return mileage;
    }

    public String getEngine() {
        return engine;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public String getDriveType() {
        return driveType;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public double getOfficeFee() {
        return officeFee;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    @Override
    public String toString() {
        return String.format("""
                Vehicle Listing:
                Listing ID: %s
                Price: %.2f
                City: %s
                Condition: %s
                Last Modified: %s
                Make: %s
                Model: %s
                Registration Number: %s
                Mileage: %d
                Engine: %s
                Model Year: %d
                Transmission: %s
                Automatic: %b
                Drive Type: %s
                Four Wheel Drive: %b
                Office Fee: %.2f
                Inspection Date: %s
                Body Style: %s
                Vehicle Type: %s
                Color: %s
                VIN Number: %s
                """, listingId, price, city, condition, lastModified, make, model, registrationNumber, mileage,
                engine, modelYear, transmission, automatic, driveType, fourWheelDrive, officeFee, inspectionDate,
                bodyStyle, vehicleType, color, vinNumber);
    }
}
