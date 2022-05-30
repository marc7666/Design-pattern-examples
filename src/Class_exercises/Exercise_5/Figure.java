package Class_exercises.Exercise_5;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public abstract class Figure {
    private float x;
    private float y;

    public Figure() {
        this.x = 0f;
        this.y = 0f;
    }

    public abstract Figure copy();

    public abstract void getFigure();
}
