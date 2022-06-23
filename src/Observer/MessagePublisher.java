package Examples.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 15/05/2022.
 */
public class MessagePublisher implements Subject{
    private List<Examples.Observer.Observer> observers = new ArrayList<>();

    @Override
    public void attach(Examples.Observer.Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Examples.Observer.Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for (Observer o : observers){
            o.update(m);
        }
    }
}
