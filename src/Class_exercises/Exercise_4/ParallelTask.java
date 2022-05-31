package Class_exercises.Exercise_4;

import java.util.Iterator;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class ParallelTask extends CompositeTask {

    private int duration;

    public ParallelTask() {
        super();
        this.duration = 0;
    }

    public void ParallelDuration(List<Integer> days) {
        Iterator<Integer> it = days.iterator();
        int max = 0;
        while (it.hasNext()) {
            var next = it.next();
            if (next > max) {
                max = next;
            }
        }
        this.duration = max;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
