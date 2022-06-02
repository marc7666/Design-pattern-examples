package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class FixedPlusComissionsFactory extends EmployeeFactory {

    private double percernt;

    public FixedPlusComissionsFactory(String name, String address, double percernt) {
        super(name, address);
        this.percernt = percernt;
    }

    @Override
    public Employee createEmployee(String name, String address) {
        FixedIncomePlusComissions f = new FixedIncomePlusComissions(name, address, this.percernt);
        System.out.println(f.toString());
        return f;
    }
}
