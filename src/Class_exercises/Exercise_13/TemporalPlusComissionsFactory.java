package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class TemporalPlusComissionsFactory extends EmployeeFactory{

    private final double percent;

    public TemporalPlusComissionsFactory(String name, String address, double percent) {
        super(name, address);
        this.percent = percent;
    }

    @Override
    public Employee createEmployee(String name, String address) {
        TemporalIncomeComissions t = new TemporalIncomeComissions(name, address, this.percent);
        System.out.println(t.toString());
        return t;
    }
}
