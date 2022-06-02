package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class StaffIncome extends Employee {
    private final long staff;

    public StaffIncome(String name, String address, long staff) {
        super(name, address);
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "StaffIncome{ Emplyee name: " + getName() + " address: " + getAddress() + " staff: " + staff + " }";
    }
}
