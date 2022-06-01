package Class_exercises.Exercise_8;

import Examples.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class CompositeTask implements Task {

    private String taskName;
    private Money cost;
    private int duration;
    public List<Task> subTasks;
    private boolean sequential;

    private List<Observer> observers = new ArrayList<>();

    public CompositeTask() {
        this.taskName = "Task name";
        this.cost = new Money(0);
        this.duration = 0;
        this.sequential = true;
        this.subTasks = new ArrayList<>();
    }

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void setParallel() {
        this.sequential = false;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void addSubTask(Task t) {
        subTasks.add(t);
    }

    public List<Task> getSubTasks() {
        return subTasks;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update2(this);
        }

    }

    public Money getCost() {
        return cost;
    }

    @Override
    public Money costInEuros() {
        int costInt = 0;
        for (Task t : subTasks) {
            costInt += t.costInEuros().getPrice();
        }
        Money returnValue = new Money(costInt);
        return returnValue;
    }

    @Override
    public int durationInDays() {
        List<Integer> days = durations();
        if (sequential) {
            SequentialTask st = new SequentialTask();
            st.SequentialDuration(days);
            return st.getDuration();
        } else {
            ParallelTask pt = new ParallelTask();
            pt.ParallelDuration(days);
            return pt.getDuration();
        }
    }

    public List<Integer> durations() {
        Iterator<Task> it = subTasks.listIterator();
        List<Integer> list = new ArrayList<>();
        while (it.hasNext()) {
            var next = it.next();
            list.add(next.getDuration());
        }
        return list;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public boolean hasFinished() {
        for (Task t : subTasks) {
            if (!t.hasFinished()) {
                return false;
            }
        }
        notifyObservers();
        return true;
    }


    @Override
    public void printStructures() {
        for (Task t : subTasks) {
            System.out.println("\t\t" + "Task: " + t.getTaskName() + " costs: " + t.costInEuros() + " has a duration of: " + t.durationInDays() +
                    " days. Has finished? => " + t.hasFinished());
        }
    }
}
