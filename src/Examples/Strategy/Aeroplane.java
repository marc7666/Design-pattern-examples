package Examples.Strategy;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Aeroplane extends Vehicle{
    public Aeroplane() {
        transportMedium = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I'm an aeroplane");
    }
}
