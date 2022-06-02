package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class FixedIncome extends Employee {
    private final long fixed;

    public FixedIncome(String name, String address, long fixed) {
        super(name, address);
        this.fixed = fixed;
    }

    @Override
    public String toString() {
        return "FixedIncome { Emplyee name: " + getName() + ", address: " + getAddress() + " and fixed: " + fixed + " }";
    }
}
