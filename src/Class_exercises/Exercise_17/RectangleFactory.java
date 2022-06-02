package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class RectangleFactory extends FigureFactory {
    private boolean displayRectangle;

    public RectangleFactory(boolean displayRectangle) {
        this.displayRectangle = displayRectangle;
    }


    @Override
    public Figure createFigure() {
        System.out.println("***** A new rectangle has been created *****");
        Rectangle r = new Rectangle();
        if (displayRectangle) {
            display();
        }
        return r;
    }

    @Override
    public void display() {
        System.out.println("You've chosen to display the rectangle");
    }
}
