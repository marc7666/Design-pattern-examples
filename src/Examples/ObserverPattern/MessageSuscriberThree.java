package Examples.ObserverPattern;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 15/05/2022.
 */
public class MessageSuscriberThree implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSuscriberThree :: " + m.getMessageContent());
    }
}
