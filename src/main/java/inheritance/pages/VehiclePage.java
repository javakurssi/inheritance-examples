package inheritance.pages;

import inheritance.Vehicle;

public class VehiclePage {

    private Vehicle vehicle;

    public VehiclePage(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String display() {
        StringBuilder html = new StringBuilder();
        html.append("<div>\n");
        html.append("  <h1>").append(vehicle.getTitle()).append("</h1>\n");
        html.append("  <p>Price: $").append(vehicle.getPrice()).append("</p>\n");
        html.append("  <p>Make: ").append(vehicle.getMake()).append("</p>\n");
        html.append("  <p>Model: ").append(vehicle.getModel()).append("</p>\n");
        html.append("  <p>Year: ").append(vehicle.getModelYear()).append("</p>\n");
        html.append("</div>");
        return html.toString();
    }
}
