package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public interface Figure {
    void clickButtonOn();

    void drag(int centimeters);

    void drop();

    void move(int from, int to);

    void scale(float newScale);
}
