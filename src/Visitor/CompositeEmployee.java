package Examples.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class CompositeEmployee implements Employee {
    private String name;
    private String dept;
    private int yearsOfExperience;
    private List<Employee> controls;

    public CompositeEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
        this.controls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<Employee> getControls() {
        return controls;
    }

    public void addEmployee(Employee e) {
        controls.add(e);
    }

    public void removeEmployee(Employee e) {
        controls.remove(e);
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDept() + ". Experience: " + getYearsOfExperience() + " years");
        for (Employee e : controls) {
            e.printStructures();
        }
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
