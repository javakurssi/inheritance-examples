package inheritance;

import java.time.LocalDate;

public class Product {

    // ilmoituksen tyyppi
    private String type; // esim. "generic", "apartment" tai "vehicle"

    // kaikille ilmoituksille yhteiset kentät
    private String listingId;
    private double price;
    private String city;
    private String condition;
    private LocalDate lastModified;

    // asuntoihin liittyvät kentät
    private double maintenanceFee;
    private double livingArea;
    private int rooms;
    private int floors;
    private int buildYear;
    private String buildingType;
    private String district;
    private String fees;

    // ajoneuvoihin liittyvät kentät
    private String make;
    private String model;
    private String registrationNumber;
    private int mileage;
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

    public Product(String type, String listingId, double price, String city, String condition, LocalDate lastModified,
            double maintenanceFee, double livingArea, int rooms, int floors, int buildYear, String buildingType,
            String district, String fees, String make, String model, String registrationNumber, int mileage,
            String engine, int modelYear, String transmission, boolean automatic, String driveType,
            boolean fourWheelDrive, double officeFee, LocalDate inspectionDate, String bodyStyle, String vehicleType,
            String color, String vinNumber) {

        this.type = type;
        this.listingId = listingId;
        this.price = price;
        this.city = city;
        this.condition = condition;
        this.lastModified = lastModified;

        this.maintenanceFee = maintenanceFee;
        this.livingArea = livingArea;
        this.rooms = rooms;
        this.floors = floors;
        this.buildYear = buildYear;
        this.buildingType = buildingType;
        this.district = district;
        this.fees = fees;

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

    public double getPricePerSquareMeter() {
        if ("apartment".equalsIgnoreCase(type) && livingArea > 0) {
            return price / livingArea;
        }
        return 0;
    }

    public String getType() {
        return type;
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

    public double getMaintenanceFee() {
        return maintenanceFee;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public int getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public String getDistrict() {
        return district;
    }

    public String getFees() {
        return fees;
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

    public int getMileage() {
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
        if ("apartment".equalsIgnoreCase(type)) {
            return String.format("""
                    Apartment Listing:
                    Listing ID: %s
                    Price: %.2f
                    City: %s
                    Condition: %s
                    Last Modified: %s
                    Maintenance Fee: %.2f
                    Living Area: %.2f
                    Rooms: %d
                    Floors: %d
                    Build Year: %d
                    Building Type: %s
                    District: %s
                    Fees: %s
                    """, listingId, price, city, condition, lastModified, maintenanceFee, livingArea, rooms, floors,
                    buildYear, buildingType, district, fees);
        }

        if ("vehicle".equalsIgnoreCase(type)) {
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

        return String.format("""
                Generic Listing:
                Listing ID: %s
                Price: %.2f
                City: %s
                Condition: %s
                Last Modified: %s
                """, listingId, price, city, condition, lastModified);
    }
}
