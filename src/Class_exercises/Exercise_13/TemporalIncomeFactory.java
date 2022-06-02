package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class TemporalIncomeFactory extends EmployeeFactory {

    private final long temporal;

    public TemporalIncomeFactory(String name, String address, long temporal) {
        super(name, address);
        this.temporal = temporal;
    }

    @Override
    public Employee createEmployee(String name, String address) {
        TemporalIncome t = new TemporalIncome(name, address, this.temporal);
        System.out.println(t.toString());
        return t;
    }
}
