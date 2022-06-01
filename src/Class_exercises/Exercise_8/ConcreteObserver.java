package Class_exercises.Exercise_8;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 01/06/2022.
 */
public class ConcreteObserver implements Observer {

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
        System.out.println("The composite task: " + ct.getTaskName() + " has finished because all of its subtasks have finished.");
        ct.printStructures();
    }

    /**
     * @Override
     *     public void update2(String taskName, List<Observer> observers) {
     *         System.out.println("The composite task: " + taskName + " has finished because all of its subtasks have finished.");
     *         for (Task t : subTasks) {
     *             System.out.println("\t\t" + "Task: " + t.getTaskName() + " costs: " + t.costInEuros() + " has a duration of: " + t.durationInDays() +
     *                     " days. Has finished? => " + t.hasFinished());
     *         }
     *     }
     * */
}
