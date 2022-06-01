package Class_exercises.Exercise_8;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public interface Task {
    Money costInEuros();

    int durationInDays();

    int getDuration();

    boolean hasFinished();

    void printStructures();

    String getTaskName();

    void notifyObservers();
}
