package Class_exercises.Exercise_10;

public class Circle extends Figure {
    private float radius;

    private String name;

    public Circle(float radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public Figure draw() {
        return this;
    }

    @Override
    public Figure copy() {
        return new Circle(this.radius, this.name);
    }

    @Override
    public String getFigureName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
