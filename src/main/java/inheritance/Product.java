package inheritance;

import java.time.LocalDate;

public class Product implements Comparable<Product> {

    private String title;
    private String listingId;
    private double price;
    private String city;
    private String condition;
    private LocalDate lastModified;

    public Product(String title, String listingId, double price, String city, String condition,
            LocalDate lastModified) {
        this.title = title;
        this.listingId = listingId;
        this.price = price;
        this.city = city;
        this.condition = condition;
        this.lastModified = lastModified;
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

    @Override
    public int compareTo(Product other) {
        LocalDate thisModified = this.getLastModified();
        LocalDate otherModified = other.getLastModified();

        return thisModified.compareTo(otherModified);
    }

    @Override
    public String toString() {
        return String.format("""
                Generic Listing:
                Title: %s
                Listing ID: %s
                Price: %.2f
                City: %s
                Condition: %s
                Last Modified: %s
                """, title, listingId, price, city, condition, lastModified);
    }
}
