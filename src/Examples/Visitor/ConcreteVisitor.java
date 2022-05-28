package Examples.Visitor;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class ConcreteVisitor implements Visitor {

    public ConcreteVisitor() {
    }

    @Override
    public void visitTheElement(CompositeEmployee employees) {
        //We'll promote the employee if he/she has more than 15 years of experience
        boolean hasExperience = employees.getYearsOfExperience() > 15;
        System.out.println("\t\t" + employees.getName() + " from " + employees.getDept() + " has more than 15 years of experience? => " + hasExperience);
    }

    @Override
    public void visitTheElement(SingleEmplyee employee) {
        //We'll promote the employee if he/she has more than 15 years of experience
        boolean hasExperience = employee.getYearsOfExperience() > 15;
        System.out.println("\t\t" + employee.getName() + " from " + employee.getDept() + " has more than 15 years of experience? => " + hasExperience);
    }
}
