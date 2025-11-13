package inheritance;

import java.util.List;

import inheritance.pages.ApartmentPage;
import inheritance.pages.ProductPage;
import inheritance.pages.VehiclePage;

public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Vehicle("Toyota Corolla 2015", "V123", 15000.0, "Helsinki", "Used",
                        java.time.LocalDate.of(2024, 5, 20), "Toyota", "Corolla", "ABC-123", 75000.0,
                        "1.8L I4", 2015, "Automatic", true, "FWD", false, 200.0,
                        java.time.LocalDate.of(2024, 12, 31), "Sedan", "Car", "Blue", "1HGBH41JXMN109186"),

                new Apartment("Spacious 2-bedroom apartment", "A456", 250000.0, "Espoo", "New",
                        java.time.LocalDate.of(2024, 6, 15), 300.0, 85.0, 2, 3, 2020,
                        "Concrete", "Leppävaara", "Water and heating included"),

                new Product("Coffee mug", "P789", 12.99, "Tampere", "New",
                        java.time.LocalDate.of(2024, 4, 10)));

        for (Product product : products) {

            if (product instanceof Vehicle vehicle) {
                VehiclePage vp = new VehiclePage(vehicle);
                System.out.println(vp.display());

            } else if (product instanceof Apartment apartment) {
                ApartmentPage ap = new ApartmentPage(apartment);
                System.out.println(ap.display());

            } else {
                ProductPage pp = new ProductPage(product);
                System.out.println(pp.display());
            }
        }
    }
}
