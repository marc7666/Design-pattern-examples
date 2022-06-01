package Class_exercises.Exercise_8;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 01/06/2022.
 */
public interface Observer {
    void update(String taskName); //Observer behaviour for a simple task

    void update2(CompositeTask ct); //Observer behaviour for a composite task

    /**
     *
     * public void update2(String taskName, List<Observer> observers);
     */

}
