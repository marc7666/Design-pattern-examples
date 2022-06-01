package Class_exercises.Exercise_8;

import java.util.Iterator;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class SequentialTask extends CompositeTask {

    private int duration;

    public SequentialTask() {
        super();
        this.duration = 0;
    }

    public void SequentialDuration(List<Integer> days) {
        Iterator<Integer> it = days.iterator();
        int sum = 0;
        while (it.hasNext()) {
            var next = it.next();
            sum += next;
        }
        this.duration = sum;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
