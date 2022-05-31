package Class_exercises.Recu16_17;

import java.util.StringTokenizer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class MeanLenght extends SequenceProcessor<String> {

    private double meanLenght;
    private double lenghts;

    public MeanLenght() {
        this.meanLenght = 0.0;
    }

    @Override
    protected void processElement(String element) {
        this.lenghts += 1;
        this.meanLenght = lenghts / element.length();
    }

    public double getMeanLenght() {
        return meanLenght;
    }
}
