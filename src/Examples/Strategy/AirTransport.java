package Examples.Strategy;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class AirTransport implements TransportMedium{
    @Override
    public void transport() {
        System.out.println("I'm transporting in air");
    }
}
