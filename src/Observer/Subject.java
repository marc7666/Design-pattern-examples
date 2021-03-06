package Examples.Observer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 15/05/2022.
 */
public interface Subject {
   public void attach(Examples.Observer.Observer o);
   public void detach (Observer o);
   public void notifyUpdate(Message m);
}
