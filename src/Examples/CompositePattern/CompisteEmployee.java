package Examples.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class CompisteEmployee implements Employee {
    public static final String ANSI_RESET = "\u001B[0m";
    private int employeeCount = 0;
    private String name;
    private String dept;
    private List<Employee> controls;

    public CompisteEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.controls = new ArrayList<Employee>();
    }

    public void addEmpluyee(Employee e) {
        controls.add(e);
    }

    public void removeEmployee(Employee e) {
        controls.remove(e);
    }

    @Override
    public void printStructures() {
        System.out.println(ANSI_RESET + "\t" + this.name + " works in: " + this.dept);
        for (Employee e : controls) {
            e.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
        employeeCount = controls.size();
        for (Employee e : controls) {
            employeeCount += e.getEmployeeCount();
        }
        return employeeCount;
    }
}
