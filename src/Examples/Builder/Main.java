package Examples.Builder;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("---------- Builder pattern example ----------");
        final ProductClass productClass = new CarBuilder().insertHeadLights(5).insertWhels(5).buildBody("Plastic").constructCar();
        System.out.println(productClass);
    }
}
