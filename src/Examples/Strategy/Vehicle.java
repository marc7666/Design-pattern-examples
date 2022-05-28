package Examples.Strategy;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public abstract class Vehicle {
    TransportMedium transportMedium;
    public Vehicle(){

    }
    public void showTransport(){
        transportMedium.transport();
    }
    public void commonJob(){
        System.out.println("We all can be used to transport");
    }
    public abstract void showMe();
}
