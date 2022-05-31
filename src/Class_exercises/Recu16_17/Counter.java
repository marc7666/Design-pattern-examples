package Class_exercises.Recu16_17;

import java.util.StringTokenizer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class Counter extends SequenceProcessor<String> {

    private int elements;

    public Counter() {
        this.elements = 0;
    }

    @Override
    protected void processElement(String element) {
        this.elements += 1;
    }

    public int getElements() {
        return elements;
    }

}
