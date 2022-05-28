package Examples.Observer2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Observer pattern example ----------");
        Observer obs1 = new ObserverType1("Joel");
        Observer obs2 = new ObserverType2("Marc");
        Subject subject = new Subject();

        subject.register(obs1);
        subject.register(obs2);

        subject.setFlag(5);
        subject.unregister(obs1);

        subject.setFlag(50);
        subject.unregister(obs2);
    }
}
