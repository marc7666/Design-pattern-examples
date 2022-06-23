package Examples.Strategy;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Boat extends Vehicle{
    public Boat() {
        transportMedium = new WaterTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I'm a boat");
    }
}
