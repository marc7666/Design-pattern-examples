package Examples.Strategy;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class WaterTransport implements TransportMedium{
    @Override
    public void transport() {
        System.out.println("I'm transporting in water");
    }
}
