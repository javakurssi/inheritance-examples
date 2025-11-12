package inheritance;

import java.time.LocalDate;

public class Apartment extends Product {

    private double maintenanceFee;
    private double livingArea;
    private int rooms;
    private int floors;
    private int buildYear;
    private String buildingType;
    private String district;
    private String fees;

    public Apartment(String title, String listingId, double price, String city, String condition,
            LocalDate lastModified, double maintenanceFee, double livingArea, int rooms, int floors, int buildYear,
            String buildingType, String district, String fees) {

        // "super" kutsuu yliluokan (Product) konstruktoria:
        super(title, listingId, price, city, condition, lastModified);

        this.maintenanceFee = maintenanceFee;
        this.livingArea = livingArea;
        this.rooms = rooms;
        this.floors = floors;
        this.buildYear = buildYear;
        this.buildingType = buildingType;
        this.district = district;
        this.fees = fees;
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

    @Override
    public String toString() {
        return String.format("""
                Apartment Listing:
                Title: %s
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
                """, getTitle(), getListingId(), getPrice(), getCity(), getCondition(), getLastModified(),
                maintenanceFee, livingArea, rooms, floors,
                buildYear, buildingType, district, fees);
    }
}
