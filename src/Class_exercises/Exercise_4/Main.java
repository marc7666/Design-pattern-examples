package Class_exercises.Exercise_4;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        /*Composite task --> No parallel*/
        System.out.println("---------- Example with sequential task ----------");
        CompositeTask ct1 = new CompositeTask();
        ct1.setTaskName("Cook");


        /*Tasks of ct1*/
        SimpleTask st1 = new SimpleTask("Buy ingredients", new Money(400), 5);
        SimpleTask st2 = new SimpleTask("Prepare ingredients", new Money(12), 1);

        ct1.addSubTask(st1);
        ct1.addSubTask(st2);
        System.out.println("Cost: " + ct1.costInEuros().toString() + " and duration: " + ct1.durationInDays());

        System.out.println("---------- Example with parallel task ----------");
        CompositeTask ct2 = new CompositeTask();
        ct2.setParallel();
        ct1.setTaskName("Build a house");


        SimpleTask st3 = new SimpleTask("Buy building materials", new Money(400), 5);
        SimpleTask st4 = new SimpleTask("Prepare building materials", new Money(12), 1);
        SimpleTask st5 = new SimpleTask("Use the prepared building materials", new Money(4500), 45);

        ct2.addSubTask(st3);
        ct2.addSubTask(st4);
        ct2.addSubTask(st5);

        System.out.println("Cost: " + ct2.costInEuros().toString() + " and duration: " + ct2.durationInDays());
    }
}
