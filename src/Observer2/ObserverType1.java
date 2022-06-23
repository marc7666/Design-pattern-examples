package Examples.Observer2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class ObserverType1 implements Observer {
    String nameOfObserver;

    public ObserverType1(String nameOfObserver) {
        this.nameOfObserver = nameOfObserver;
    }

    @Override
    public void update(int updatedValue) {
        System.out.println(nameOfObserver + " has received an alert " + updatedValue);
    }
}
