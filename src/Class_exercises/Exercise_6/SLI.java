package Class_exercises.Exercise_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class SLI { //SLI = sales new item
    private ProductDescription desc;
    private int quantity;
    List<ObserverPull> observers = new ArrayList<>();

    public SLI(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }

    public int subTotal() {
        int subTotal = desc.price() * quantity;
        notify(subTotal);
        return subTotal;

    }

    public void register(ObserverPull o) {
        observers.add(o);
    }

    public ProductDescription getDesc() {
        return desc;
    }

    public int getQuantity() {
        return quantity;
    }


    public void notify(int subTotal) {
        for (ObserverPull o : observers) {
            o.update(subTotal);
        }
    }

    public void getSLI() {
        System.out.println("Product description: " + desc.getDescription() + " quantity: " + quantity + ". Price by unit: " + desc.getPrice());
    }
}
