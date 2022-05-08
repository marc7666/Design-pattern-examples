package Class_exercises.Exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 09/05/2022.
 */
public class CompositeTask implements TaskManager {


    private int taskCount = 0;
    private String taskName;
    private Money cost;
    private List<SimpleTask> controls;
    private int duration;

    public CompositeTask(String taskName) {
        this.taskName = taskName;
        this.cost = new Money(0);
        this.duration = 0;
        this.controls = new ArrayList<SimpleTask>();
    }

    public void addTask(SimpleTask task) {
        controls.add(task);
    }

    public void removeTask(Money task) {
        controls.remove(task);
    }

    @Override
    public Money costInEuros() {
        int costInt = 0;
        for (SimpleTask t : controls) {
            costInt += t.costInEuros().getCost();
        }
        Money m = new Money(costInt);
        return m;
    }

    @Override
    public int durationInDays() {
        for (SimpleTask st : controls) {
            this.duration += st.durationInDays();
        }
        return this.duration;
    }


    public void printTasks() {
        costInEuros();
        for (SimpleTask st : controls) {
            st.printTask();
        }
    }

    public String getTaskName() {
        return taskName;
    }
}
