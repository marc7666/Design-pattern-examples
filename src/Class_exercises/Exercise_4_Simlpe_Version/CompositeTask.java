package Class_exercises.Exercise_4_Simlpe_Version;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 09/05/2022.
 */
public class CompositeTask implements TaskManager {
    public static final String ANSI_GREEN = "\u001B[32m";
    private String taskName;
    private Money cost;
    private List<TaskManager> controls;
    private int duration;

    public CompositeTask(String taskName) {
        this.taskName = taskName;
        this.cost = new Money(0);
        this.duration = 0;
        this.controls = new ArrayList<TaskManager>();
    }

    public void addTask(TaskManager task) {
        controls.add(task);
    }

    public void removeTask(Money task) {
        controls.remove(task);
    }

    @Override
    public Money costInEuros() {
        int costInt = 0;
        for (TaskManager t : controls) {
            costInt += t.costInEuros().getCost();
        }
        Money m = new Money(costInt);
        return m;
    }

    @Override
    public int durationInDays() {
        for (TaskManager st : controls) {
            this.duration += st.durationInDays();
        }
        return this.duration;
    }

    public void printTasks() {
        costInEuros();
        Iterator it = this.controls.iterator();
        while (it.hasNext()) {
            var aux = it.next();
            System.out.println(ANSI_GREEN + "\t\t " + aux.toString());
        }
    }

    @Override
    public String toString() {
        return "CompositeTask {" +
                "taskName = '" + taskName + '\'' +
                ", cost = " + cost +
                ", controls = " + controls +
                ", duration = " + duration +
                '}';
    }

    public String getTaskName() {
        return taskName;
    }
}
