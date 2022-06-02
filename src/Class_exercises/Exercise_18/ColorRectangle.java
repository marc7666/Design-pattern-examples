package Class_exercises.Exercise_18;

import java.awt.*;

public class ColorRectangle extends Rectangle {
    private Color c;

    public ColorRectangle(float width, float height, Color c) {
        super(width, height);
        this.c = c;
    }

    @Override
    public Figure copy() {
        return new ColorRectangle(getWidth(), getHeight(), this.c);
    }

    @Override
    public String toString() {
        return "ColorRectangle{" + " Height: " + this.getHeight() + " Width: " + this.getWidth() +
                "c=" + c +
                '}';
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visit(this);
    }
}
