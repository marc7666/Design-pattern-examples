package Class_exercises.Exercise_5;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Line extends Figure {
    private float x2;
    private float y2;

    public Line(float x2, float y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public Figure copy() {
        return new Line(this.x2, this.y2);
    }

    @Override
    public void getFigure() {
        System.out.println("This is a line with x2 = " + x2 + " and y2 = " + y2);
    }


}
