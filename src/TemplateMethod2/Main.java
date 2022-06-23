package Examples.TemplateMethod2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("---------- Template method example ----------");
        BuildCar buildCar = new HybridCar();
        buildCar.type();
        buildCar.body("Steel");
        buildCar.engine(120);
        buildCar.numWheels(4);
        buildCar.hybrid(60);

        System.out.println("\n");

        buildCar = new ThermicalCar();
        buildCar.type();
        buildCar.body("Carbon fiber");
        buildCar.engine(300);
        buildCar.numWheels(5);
        //buildCar.hybrid(12);
    }
}
