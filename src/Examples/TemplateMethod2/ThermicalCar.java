package Examples.TemplateMethod2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class ThermicalCar extends BuildCar{
    @Override
    public void hybrid(int power) {
        System.out.println("");
    }

    @Override
    public void type() {
        System.out.println("This car has a 100% combustion engine");
    }
}
