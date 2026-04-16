package interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import inheritance.Apartment;
import inheritance.Product;
import inheritance.Vehicle;

public class ComparingProducts {

    public static void main(String[] args) {
        Vehicle corolla = new Vehicle("Toyota Corolla 2015", "V123", 15000.0, "Helsinki", "Used",
                java.time.LocalDate.of(2024, 5, 20), "Toyota", "Corolla", "ABC-123", 75000.0,
                "1.8L I4", 2015, "Automatic", true, "FWD", false, 200.0,
                java.time.LocalDate.of(2024, 12, 31), "Sedan", "Car", "Blue", "1HGBH41JXMN109186");

        Apartment apartment = new Apartment("Spacious 2-bedroom apartment", "A456", 250000.0, "Espoo", "New",
                java.time.LocalDate.of(2024, 6, 15), 300.0, 85.0, 2, 3, 2020,
                "Concrete", "Leppävaara", "Water and heating included");

        Product mug = new Product("Coffee mug", "P789", 12.99, "Tampere", "New",
                java.time.LocalDate.of(2024, 4, 10));

        List<Product> products = Arrays.asList(corolla, apartment, mug);

        Collections.sort(products);

        for (Product p : products) {
            System.out.println(p.getTitle() + " " + p.getPrice());
        }
    }
}
