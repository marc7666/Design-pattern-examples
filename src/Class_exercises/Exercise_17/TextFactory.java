package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class TextFactory extends FigureFactory {
    private boolean displayText;

    public TextFactory(boolean displayText) {
        this.displayText = displayText;
    }


    @Override
    public Figure createFigure() {
        System.out.println("***** A new text has been created *****");
        Text t = new Text();
        if (displayText) {
            display();
        }
        return t;
    }

    @Override
    public void display() {
        System.out.println("You've chosen to display the text");
    }
}
