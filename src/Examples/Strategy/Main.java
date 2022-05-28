package Examples.Strategy;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("---------- Strategy method example ----------");
        Vehicle vehicle = new Boat();
        vehicle.showMe();
        vehicle.commonJob();
        vehicle.showTransport();

        System.out.println("-------------------");

        vehicle = new Aeroplane();
        vehicle.showMe();
        vehicle.commonJob();
        vehicle.showTransport();
    }
}
