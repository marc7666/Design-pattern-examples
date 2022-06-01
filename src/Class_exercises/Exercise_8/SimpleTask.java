package Class_exercises.Exercise_8;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class SimpleTask implements Task {
    private String taskName;
    private Money cost;
    private int duration;

    private boolean finished;

    private List<Observer> observers = new ArrayList<>();

    public SimpleTask(String taskName, Money cost, int duration) {
        this.taskName = taskName;
        this.cost = cost;
        this.duration = duration;
        this.finished = false;
    }

    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.getTaskName());
        }
    }

    public void finish() {
        notifyObservers();
        this.finished = true;
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
    public boolean hasFinished() {
        return this.finished;
    }

    public void printStructures() {
        System.out.println("\t\t" + "Task: " + this.taskName + " costs: " + this.cost + " has a duration of: " + this.duration + " days. Has finished? =>" + this.finished);
    }
}
