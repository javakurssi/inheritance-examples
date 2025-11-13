package inheritance.pages;

import inheritance.Product;

public class ProductPage {

    private Product product;

    public ProductPage(Product product) {
        this.product = product;
    }

    public String display() {
        StringBuilder html = new StringBuilder();
        html.append("<div>\n");
        html.append("  <h1>").append(product.getTitle()).append("</h1>\n");
        html.append("  <p>Price: ").append(product.getPrice()).append(" €</p>\n");
        html.append("</div>");
        return html.toString();
    }
}
