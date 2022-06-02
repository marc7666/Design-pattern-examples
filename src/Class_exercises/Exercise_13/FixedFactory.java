package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class FixedFactory extends EmployeeFactory {

    private final long fixed;

    public FixedFactory(String name, String address, long fixed) {
        super(name, address);
        this.fixed = fixed;
    }

    @Override
    public Employee createEmployee(String name, String address) {
        FixedIncome emp = new FixedIncome(name, address, this.fixed);
        System.out.println(emp.toString());
        return emp;
    }
}
