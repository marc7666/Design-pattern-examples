package Class_exercises.Recu16_17;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class CompositeSequenceProcessor<E> extends SequenceProcessor<E>{

    private List<SequenceProcessor<E>> components = new ArrayList<>();

    @Override
    protected void processElement(E element) {
        for (var component : components){
            component.processElement(element);
        }
    }

    public void addComponent(SequenceProcessor<E> newC){
        components.add(newC);
    }
}
