package Class_exercises.Exercise_18;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------ Composite pattern check ------------------------------" + "\n");
        System.out.println("***** Checking copies *****");
        Drawing d1 = new Drawing();

        Circle c1 = new Circle(12f);
        Rectangle r1 = new Rectangle(23f, 66f);
        Line l1 = new Line(5f, 6f);
        ColorRectangle cr1 = new ColorRectangle(11f, 55f, Color.BLUE);

        d1.addSubfigure(c1);
        d1.addSubfigure(r1);
        d1.addSubfigure(l1);
        d1.addSubfigure(cr1);

        Drawing d2 = (Drawing) d1.copy();
        Circle c2 = (Circle) c1.copy();
        Rectangle r2 = (Rectangle) r1.copy();
        ColorRectangle cr2 = (ColorRectangle) cr1.copy();
        System.out.println("\n" + "*** Checking drawings ***" + "\n");
        System.out.println("Drawing 1: " + d1.toString());
        System.out.println("Drawing 2: " + d2.toString());
        System.out.println("\n" + "*** Checking circles ***" + "\n");
        System.out.println("Circle 1: " + c1.toString());
        System.out.println("Circle 2: " + c2.toString());
        System.out.println("\n" + "Checking rectangles ***" + "\n");
        System.out.println("Rectangle 1: " + r1.toString());
        System.out.println("Rectangle 2: " + r2.toString());
        System.out.println("\n" + "*** Checking colored rectangles ***" + "\n");
        System.out.println("Color rectangle 1: " + cr1.toString());
        System.out.println("Color rectangle 2: " + cr2.toString());
        System.out.println("\n" + "-----------------------------------------------------------------------------------" + "\n");

        System.out.println("\n" + "------------------------------ Visitor pattern check ------------------------------" + "\n");
        Drawing d3 = new Drawing();

        Circle c3 = new Circle(12f);
        Rectangle r3 = new Rectangle(23f, 66f);
        Line l3 = new Line(5f, 6f);
        ColorRectangle cr3 = new ColorRectangle(11f, 55f, Color.BLUE);

        d3.addSubfigure(c3);
        d3.addSubfigure(r3);
        d3.addSubfigure(l3);
        d3.addSubfigure(cr3);
        System.out.println("\n" + "*** Original values of the objects ***" + "\n");
        System.out.println("Drawing 3: " + d3.toString());
        System.out.println("Circle 3: " + c3.toString());
        System.out.println("Rectangle 3: " + r3.toString());

        Circle c4 = new Circle(12f);
        Rectangle r4 = new Rectangle(23f, 66f);
        Line l4 = new Line(5f, 6f);
        ColorRectangle cr4 = new ColorRectangle(11f, 55f, Color.BLUE);
        Visitor myVisitor = new ConcreteVisitor(4);
        System.out.println("\n" + "*** Scaling individual figures ***" + "\n");
        c4.acceptVisitor(myVisitor);
        r4.acceptVisitor(myVisitor);
        l4.acceptVisitor(myVisitor);
        cr4.acceptVisitor(myVisitor);
        System.out.println("\n" + "*** Scaling the figures of a draw ***" + "\n");
        d3.acceptVisitor(myVisitor);
        System.out.println("\n" + "-----------------------------------------------------------------------------------" + "\n");

    }
}
