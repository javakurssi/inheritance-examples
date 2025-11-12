package inheritance.pages;

import inheritance.Apartment;

public class ApartmentPage {

    private Apartment apartment;

    public ApartmentPage(Apartment apartment) {
        this.apartment = apartment;
    }

    public String display() {
        StringBuilder html = new StringBuilder();
        html.append("<div>\n");
        html.append("  <h1>").append(apartment.getTitle()).append("</h1>\n");
        html.append("  <p>Price: $").append(apartment.getPrice()).append("</p>\n");
        html.append("  <p>Size: ").append(apartment.getLivingArea()).append(" sqm</p>\n");
        html.append("  <p>Rooms: ").append(apartment.getRooms()).append("</p>\n");
        html.append("  <p>Floor: ").append(apartment.getFloors()).append("</p>\n");
        html.append("  <p>Year Built: ").append(apartment.getBuildYear()).append("</p>\n");
        html.append("</div>");
        return html.toString();
    }
}
