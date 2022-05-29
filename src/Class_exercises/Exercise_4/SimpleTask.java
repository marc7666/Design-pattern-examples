package Class_exercises.Exercise_4;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class SimpleTask implements Task {
    private String taskName;
    private Money cost;
    private int duration;

    public SimpleTask(String taskName, Money cost, int duration) {
        this.taskName = taskName;
        this.cost = cost;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }

    public Money getCost() {
        return cost;
    }

    @Override
    public Money costInEuros() {
        return this.cost;
    }

    @Override
    public int durationInDays() {
        return this.duration;
    }

    @Override
    public int getDuration() {
        return this.duration;
    }


    @Override
    public String toString() {
        return "SimpleTask{" +
                "taskName='" + taskName + '\'' +
                ", cost=" + cost +
                ", duration=" + duration +
                '}';
    }
}
