package Class_exercises.Exercise_5;

import java.awt.*;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Exercise 5 ----------");

        /* New drawing */
        Drawing draw = new Drawing(0f, 0f);

        /* Drawing figures */
        Circle c1 = new Circle(12.3f, 0f, 0f);
        Rectangle r1 = new Rectangle(0f, 0f, 2.5f, 3.6f);
        Line l1 = new Line(0f, 0f, 12f, 7.2f);
        ColorRectangle cR1 = new ColorRectangle(0f, 0f, 45.2f, 66f, Color.BLUE);

        /* Adding the figures to draw */
        draw.addSubfigure(c1);
        draw.addSubfigure(r1);
        draw.addSubfigure(l1);
        draw.addSubfigure(cR1);

        draw.getFigure();

        System.out.println("---------- Copying figures ----------");
        Drawing drawing2 = (Drawing) draw.copy();
        Rectangle r2 = (Rectangle) r1.copy();
        Line l2 = (Line) l1.copy();
        ColorRectangle cR2 = (ColorRectangle) cR1.copy();

        drawing2.getFigure();
    }
}

