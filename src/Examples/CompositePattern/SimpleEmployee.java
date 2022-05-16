package Examples.CompositePattern;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class SimpleEmployee implements Employee {
    public static final String ANSI_RESET = "\u001B[0m";
    private int employeeCount = 0;
    private String name;
    private String dept;

    public SimpleEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void printStructures() {
        System.out.println(ANSI_RESET + "\t\t" + this.name + " works in: " + this.dept);
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }
}
