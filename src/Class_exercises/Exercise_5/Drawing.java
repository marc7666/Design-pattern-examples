package Class_exercises.Exercise_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Drawing extends Figure {
    private List<Figure> subfigures;

    public Drawing() {
        this.subfigures = new ArrayList<>();
    }

    @Override
    public Figure copy() {
        Drawing newDrawing = new Drawing();
        newDrawing.subfigures = this.subfigures;
        return newDrawing;
    }

    @Override
    public void getFigure() {
        for (Figure f : subfigures) {
            f.getFigure();
        }
    }

    public void addSubfigure(Figure figure) {
        subfigures.add(figure);
    }


}
