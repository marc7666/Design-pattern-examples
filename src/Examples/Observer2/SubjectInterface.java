package Examples.Observer2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public interface SubjectInterface {
    void register(Observer anObserver);

    void unregister(Observer anObserver);

    void notify(int notifiedValue);
}
