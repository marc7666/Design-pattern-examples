package Class_exercises.Exercise_10;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Figure {

    List<Figure> subfigures;

    private String name;
    public Composite(String name) {
        this.subfigures = new ArrayList<>();
        this.name = name;
    }

    @Override
    public Figure draw() {
        return this;
    }

    public List<Figure> getSubfigures() {
        return subfigures;
    }

    @Override
    public Figure copy() {
        Composite retVal = new Composite(this.name);
        retVal.subfigures = this.getSubfigures();
        return retVal;
    }

    @Override
    public String getFigureName() {
        return this.name;
    }

    public void addSubfigure(Figure s) {
        this.subfigures.add(s);
    }

    @Override
    public String toString() {
        return "Composite{" +
                "subfigures=" + subfigures +
                '}';
    }
}
