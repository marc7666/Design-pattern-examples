package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class StaffIncomeFactory extends EmployeeFactory{

    private final long staff;

    public StaffIncomeFactory(String name, String address, long staff) {
        super(name, address);
        this.staff = staff;
    }

    @Override
    public Employee createEmployee(String name, String address) {
        StaffIncome s = new StaffIncome(name, address, this.staff);
        System.out.println(s.toString());
        return s;
    }
}
