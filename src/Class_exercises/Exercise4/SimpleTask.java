package Class_exercises.Exercise4;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 08/05/2022.
 */
public class SimpleTask implements TaskManager {

    private int taskCount = 0;
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

    public String cost(){
        String c = String.valueOf(this.cost.getCost());
        return c;
    }

    public void printTask(){
        System.out.println("\t\t" + this.taskName + " costs: " + cost() + " and has a duration of: " + this.duration);
    }
}
