package Class_exercises.Recu16_17;

import java.io.BufferedReader;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        var multi = new CompositeSequenceProcessor<String>();
        var counter = new Counter();
        var mean = new MeanLenght();
        multi.addComponent(counter);
        multi.addComponent(mean);
        var lines = new LinesIterator(new BufferedReader(/* Parameters */));
        multi.processSequence(lines);
        System.out.println(counter.getElements() + " is the counter");
        System.out.println(mean.getMeanLenght() + " is the mean lenght");
    }

}
