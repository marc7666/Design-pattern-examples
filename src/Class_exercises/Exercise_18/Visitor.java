package Class_exercises.Exercise_18;

public interface Visitor {
    void visit(Circle c);

    void visit(Rectangle r);

    void visit(Line l);

    void visit(ColorRectangle cr);

}
