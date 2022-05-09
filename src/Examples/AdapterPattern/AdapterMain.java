package Examples.AdapterPattern;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class AdapterMain {

    public static void main(String[] args) {
        Connectable lamp1 = new Lamp();
        lamp1.switchOn();
        System.out.println("The lamp is on? " + lamp1.isOn());

        Connectable pc1 = new Computer();
        pc1.switchOn();
        System.out.println("The computer is on? " + pc1.isOn());


        Connectable adapter = new Adapter();
        adapter.switchOn();
        System.out.println("The adapter is on? " + adapter.isOn());
    }
}
