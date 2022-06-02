package Class_exercises.Exercise_18;

import java.util.List;

public class ConcreteVisitor implements Visitor {
    private float scalerFactor;

    public ConcreteVisitor(float scalerFactor) {
        this.scalerFactor = scalerFactor;
    }

    @Override
    public void visit(Circle c) {
        System.out.println("*** Scaling a circle ***");
        c.setRadius(c.getRadius() * scalerFactor);
        System.out.println("New radius: " + c.getRadius());
    }

    @Override
    public void visit(Rectangle r) {
        System.out.println("*** Scaling a rectangle ***");
        float newHeight = r.getHeight() * scalerFactor;
        float newWidth = r.getWidth() * scalerFactor;
        r.setHeight(newHeight);
        r.setWidth(newWidth);
        System.out.println("New height: " + r.getHeight());
        System.out.println("New width: " + r.getWidth());
    }

    @Override
    public void visit(Line l) {
        System.out.println("*** Scaling a line ***");
        float newX2 = l.getY2() + scalerFactor * (l.getX2() - l.getY2());
        float newY2 = l.getX2() + scalerFactor * (l.getY2() - l.getX2());
        l.setX2(newX2);
        l.setY2(newY2);
        System.out.println("New x2: " + l.getX2());
        System.out.println("New y2: " + l.getY2());
    }

    @Override
    public void visit(ColorRectangle cr) {
        System.out.println("*** Scaling a colored rectangle ***");
        float newHeightCR = cr.getHeight() * scalerFactor;
        float newWidthCR = cr.getWidth() * scalerFactor;
        cr.setHeight(newHeightCR);
        cr.setWidth(newWidthCR);
        System.out.println("New height: " + cr.getHeight());
        System.out.println("New width: " + cr.getWidth());
    }
}
