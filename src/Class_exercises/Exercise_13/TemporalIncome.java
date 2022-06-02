package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class TemporalIncome extends Employee {
    private final long temporal;

    public TemporalIncome(String name, String address, long temporal) {
        super(name, address);
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "TemporalIncome { Employee name: " + getName() + " address: " + getAddress() + " temporal: " + temporal + " }";
    }
}
