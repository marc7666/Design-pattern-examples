package Class_exercises.Recu16_17;

import java.util.Iterator;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public abstract class SequenceProcessor<String> {

    public void processSequence(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String element = iterator.next();
            processElement(element);
        }
    }

    protected abstract void processElement(String element);
}
