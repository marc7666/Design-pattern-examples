package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class TemporalIncomeComissions extends Employee {
    private final double percent;


    public TemporalIncomeComissions(String name, String address, double percent) {
        super(name, address);
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "TemporalIncomeComissions{ Employee name: " + getName() + " address: " + getAddress() + " comission %: " + percent + " }";
    }
}
