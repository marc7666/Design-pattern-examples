package Examples.Observer2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class ObserverType2 implements Observer {
    String name;

    public ObserverType2(String name) {
        this.name = name;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println(name + " has received an alert " + updatedValue);
    }
}
