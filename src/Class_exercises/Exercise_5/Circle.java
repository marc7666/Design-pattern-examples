package Class_exercises.Exercise_5;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Circle extends Figure {
    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public Figure copy() {
        return new Circle(this.r);
    }

    @Override
    public void getFigure() {
        System.out.println("This is a circle of radius " + r);
    }


}
