package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public abstract class EmployeeFactory {

    private final String name;
    private final String address;

    public EmployeeFactory(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Employee makeEmployee() {
        System.out.println("---------- Inside Employee factory ----------");
        Employee e = createEmployee(this.name, this.address);
        return e;
    }

    public abstract Employee createEmployee(String name, String address);
}
