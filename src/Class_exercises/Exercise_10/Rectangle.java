package Class_exercises.Exercise_10;

public class Rectangle extends Figure {
    private float width;
    private float height;

    private String name;

    public Rectangle(float width, float height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }


    @Override
    public Figure draw() {
        return this;
    }

    @Override
    public Figure copy() {
        return new Rectangle(this.width, this.height, this.name);
    }

    @Override
    public String getFigureName() {
        return this.name;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
