package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class LineFactory extends FigureFactory {
    private boolean displayLine;

    public LineFactory(boolean displayLine) {
        this.displayLine = displayLine;
    }

    @Override
    public Figure createFigure() {
        System.out.println("***** A new line has been created *****");
        Line l = new Line();
        if (displayLine) {
            display();
        }
        return l;
    }

    @Override
    public void display() {
        System.out.println("You've chosen to display the line");
    }
}
