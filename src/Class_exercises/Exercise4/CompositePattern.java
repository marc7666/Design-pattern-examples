package Class_exercises.Exercise4;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 09/05/2022.
 */
public class CompositePattern {
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {


        /*Tasks for build a car*/
        SimpleTask st1 = new SimpleTask("Buy V8 engine", new Money(21000), 16);
        SimpleTask st2 = new SimpleTask("Install V8 engine", new Money(19000), 15);

        /*Tasks for prepare a receipt*/
        SimpleTask st3 = new SimpleTask("Buy ingredients", new Money(125), 1);
        SimpleTask st4 = new SimpleTask("Prepare ingredients", new Money(12), 1);
        SimpleTask st5 = new SimpleTask("Cook ingredients", new Money(50), 2);

        CompositeTask ct1 = new CompositeTask("Build a car");
        CompositeTask ct2 = new CompositeTask("Cook a receipt");

        ct1.addTask(st1);
        ct1.addTask(st2);

        ct2.addTask(st3);
        ct2.addTask(st4);
        ct2.addTask(st5);

        System.out.println(ANSI_CYAN + "The task " + ct1.getTaskName() + " has a cost of: " + ct1.costInEuros() + " and is: " + ct1.durationInDays() + " days long");
        ct1.printTasks();

        System.out.println("\n");

        System.out.println(ANSI_CYAN + "The task " + ct2.getTaskName() + " has a cost of: " + ct2.costInEuros() + " and is: " + ct2.durationInDays() + " days long");
        ct2.printTasks();

    }
}
