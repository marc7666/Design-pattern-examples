package Class_exercises.Exercise_18;

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
    public void acceptVisitor(Visitor v) {
        v.visit(this);
    }

    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
