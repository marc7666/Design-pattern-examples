package Class_exercises.Exercise_6;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class ProductDescription {
    private String description;
    private int price;

    public ProductDescription(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int price() {
        return this.price;
    }

    public int getPrice() {
        return price;
    }

    public void getProductDetails() {
        System.out.println("Description: " + description + " price: " + price);
    }
}
