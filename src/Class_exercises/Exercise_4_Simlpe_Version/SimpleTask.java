package Class_exercises.Exercise_4_Simlpe_Version;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 08/05/2022.
 */
public class SimpleTask implements TaskManager {
    public static final String ANSI_GREEN = "\u001B[32m";
    private String taskName;
    private Money cost;

    private int duration;

    public SimpleTask(String taskName, Money cost, int duration) {
        this.taskName = taskName;
        this.cost = cost;
        this.duration = duration;
    }

    @Override
    public Money costInEuros() {
        return this.cost;
    }

    @Override
    public int durationInDays() {
        return duration;
    }

    @Override
    public String toString() {
        return "SimpleTask {" +
                "taskName = '" + taskName + '\'' +
                ", cost = " + cost +
                ", duration = " + duration +
                '}';
    }
}
