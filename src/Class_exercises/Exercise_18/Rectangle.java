package Class_exercises.Exercise_18;

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

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public Figure copy() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visit(this);
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
