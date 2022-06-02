package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Line implements Figure {

    @Override
    public void clickButtonOn() {
        System.out.println("Button on has been clicked");
    }

    @Override
    public void drag(int centimeters) {
        System.out.println("The line has been dragged " + centimeters + " centimeters");
    }

    @Override
    public void drop() {
        System.out.println("The line has been dropped");
    }

    @Override
    public void move(int from, int to) {
        System.out.println("Te line has been moved from " + from + " to " + to);
    }

    @Override
    public void scale(float newScale) {
        System.out.println("The line has been rescaled with this new scale: " + newScale);
    }
}
