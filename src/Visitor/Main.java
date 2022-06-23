package Examples.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Visitor pattern + composite pattern example ----------");
        /* Department heads */
        CompositeEmployee mathH = new CompositeEmployee("Nacho", "Math", 14);
        CompositeEmployee compScienceH = new CompositeEmployee("Francesc", "Computer science", 16);

        /* Math teachers */
        SingleEmplyee math1 = new SingleEmplyee("Josep Maria", "Math", 13);
        SingleEmplyee math2 = new SingleEmplyee("Jordi Pujolas", "Math", 6);

        /* Computer science teachers */
        SingleEmplyee cs1 = new SingleEmplyee("Carlos Ansotegui", "Computer science", 10);
        SingleEmplyee cs2 = new SingleEmplyee("Jordi Planes", "Computer science", 13);
        SingleEmplyee cs3 = new SingleEmplyee("Ramon Bejar", "Computer science", 7);

        /* Principle of the college */
        CompositeEmployee principal = new CompositeEmployee("Magda Valls", "Management team", 20);

        /* Adding teachers to his departments */
        mathH.addEmployee(math1);
        mathH.addEmployee(math2);

        compScienceH.addEmployee(cs1);
        compScienceH.addEmployee(cs2);
        compScienceH.addEmployee(cs3);

        principal.addEmployee(mathH);
        principal.addEmployee(compScienceH);

        System.out.println("\n***Visitor starts visiting our composite structure***\n");
        System.out.println("---The minimum criteria for promotion is as follows ---");
        System.out.println("--Junior Teachers-12 years and Senior teachers-15 years.--\n");

        Visitor myVisitor = new ConcreteVisitor();

        /* First of all we're going to introduce in a list all the employees who will be considered for promotion.
         * Principal is the highest position --> Not considered for promotion */

        List<Employee> container = new ArrayList<Employee>();

        /* Introducing in the container the principal's subordinates */

        for (Employee e : principal.getControls()) {
            container.add(e);
        }

        /* Introducing in the container the mathematics head department subordinates */

        for (Employee e : mathH.getControls()) {
            container.add(e);
        }

        /* Introducing in the container the computer science head department subordinates */

        for (Employee e : compScienceH.getControls()) {
            container.add(e);
        }

        /* Checking ham many employees can promote */

        for (Employee e : container) {
            e.acceptVisitor(myVisitor);
        }
    }
}
