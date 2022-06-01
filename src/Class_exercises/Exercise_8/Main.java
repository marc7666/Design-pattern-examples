package Class_exercises.Exercise_8;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        CompositeTask ct1 = new CompositeTask();
        ct1.setTaskName("Build a house");

        SimpleTask st1 = new SimpleTask("Buy materials", new Money(12000), 12);
        SimpleTask st2 = new SimpleTask("Use materials", new Money(200000), 365);

        ct1.addSubTask(st1);
        ct1.addSubTask(st2);

        Observer myObserver = new ConcreteObserver("Marc");
        ct1.addObserver(myObserver);
        st1.addObserver(myObserver);
        st2.addObserver(myObserver);

        st1.finish();
        st2.finish();
        ct1.hasFinished();

        System.out.println("\n" + "---------- Invoice ----------");
        System.out.println("The work " + ct1.getTaskName() + " has a final cost of: " + ct1.costInEuros() + " and has been realized in " + ct1.durationInDays() + " days");
        System.out.println("---------- Invoice breakdown ----------");
        ct1.printStructures();


    }
}
