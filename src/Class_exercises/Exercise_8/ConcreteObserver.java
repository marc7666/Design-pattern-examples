package Class_exercises.Exercise_8;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 01/06/2022.
 */
public class ConcreteObserver implements Observer{

    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }


    @Override
    public void update(String taskName) {
        System.out.println("The simple task: " + taskName + " has finished.");
    }

    @Override
    public void update2(CompositeTask ct) {
        System.out.println("The composite task: " + ct.getTaskName() + " has finished because all of it's subtasks have finished.");
        ct.printStructures();
    }
}
