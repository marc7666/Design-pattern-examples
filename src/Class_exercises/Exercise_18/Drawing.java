package Class_exercises.Exercise_18;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {

    private List<Figure> subfigures;

    public Drawing() {
        this.subfigures = new ArrayList<>();
    }

    public void addSubfigure(Figure f) {
        this.subfigures.add(f);
    }

    public List<Figure> getSubfigures() {
        return subfigures;
    }

    public void printStructures() {
        for (Figure f : subfigures) {
            f.toString();
        }
    }

    public void setSubfigures(List<Figure> subfigures) {
        this.subfigures = subfigures;
    }

    @Override
    public Figure copy() {
        Drawing d = new Drawing();
        d.subfigures = this.subfigures;
        return d;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        for (Figure f : subfigures) {
            if (f instanceof Circle) {
                v.visit((Circle) f);
            } else if (f instanceof Rectangle) {
                v.visit((Rectangle) f);
            } else if (f instanceof Line) {
                v.visit((Line) f);
            }
        }
    }


    @Override
    public String toString() {
        return "Drawing{" +
                "subfigures=" + subfigures +
                '}';
    }
}
