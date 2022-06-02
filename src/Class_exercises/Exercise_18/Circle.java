package Class_exercises.Exercise_18;

public class Circle extends Figure{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public Figure copy() {
        return new Circle(this.radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
