package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class StaffIncomeComissions extends Employee {
    private final double percent;

    public StaffIncomeComissions(String name, String address, double percent) {
        super(name, address);
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "StaffIncomeComissions{ Employee name: " + getName() + " address: " + getAddress() + " comision %: " + percent + "}";
    }
}
