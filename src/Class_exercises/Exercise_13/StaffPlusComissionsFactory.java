package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class StaffPlusComissionsFactory extends EmployeeFactory{

    private final double comission;

    public StaffPlusComissionsFactory(String name, String address, double comission) {
        super(name, address);
        this.comission = comission;
    }


    @Override
    public Employee createEmployee(String name, String address) {
        StaffIncomeComissions s = new StaffIncomeComissions(name, address, this.comission);
        System.out.println(s.toString());
        return s;
    }
}
