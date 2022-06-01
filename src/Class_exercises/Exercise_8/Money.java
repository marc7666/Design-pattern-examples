package Class_exercises.Exercise_8;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class Money {
    private int price;

    public Money(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cost = " + price;
    }
}
