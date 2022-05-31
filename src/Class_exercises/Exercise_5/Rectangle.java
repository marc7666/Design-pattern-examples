package Class_exercises.Exercise_5;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public Figure copy() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void getFigure() {
        System.out.println("This is a rectangle of width " + width + " and height " + height);
    }


}
