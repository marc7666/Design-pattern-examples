package Examples.TemplateMethod2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class HybridCar extends BuildCar{
    @Override
    public void hybrid(int power) {
        System.out.println("The power of the electrical engine is: " + power + " W");
    }

    @Override
    public void type() {
        System.out.println("This car has an electric engine");
    }
}
