package Class_exercises.Exercise_6;

import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class ConcreteObserverPull implements ObserverPull {

    private String observerName;

    public ConcreteObserverPull(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(int subtotal) {
        System.out.println("The observer " + observerName + " has received a new subTotal");
        System.out.println("The subTotal for this product is: " + subtotal);
        System.out.println("------------------------------- End of the ticket -------------------------------" + "\n");
    }

    @Override
    public void update2(ProductDescription pd, int quantity) {
        System.out.println("Registering a new product, please wait a moment...");
        System.out.println("Product's description: " + pd.getDescription() + " quantity: " + quantity + " REGISTERED WITH EXIT" + "\n");
    }

    @Override
    public void update3(Sale sale, Store store) {
        System.out.println("Store's name: " + store.getName());
    }

    @Override
    public void update4(Sale sale) {
        System.out.println("--------------------- At this time the sale has this lines: ---------------------");
        sale.getLines();

    }


}
