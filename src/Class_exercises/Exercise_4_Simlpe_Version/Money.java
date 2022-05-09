package Class_exercises.Exercise_4_Simlpe_Version;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 09/05/2022.
 */
public class Money {
    private int cost;

    public Money(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "" + cost;
    }
}
