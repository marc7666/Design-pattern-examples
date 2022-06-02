package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public abstract class FigureFactory {

    public Figure makeFigure() {
        System.out.println("---------- You're inside the figure factory. You must to obey my rules ----------");
        Figure f = createFigure();
        return f;
    }

    public abstract Figure createFigure();

    public abstract void display();
}
