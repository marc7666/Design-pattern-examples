package Examples.Observer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 15/05/2022.
 */
public class MessageSuscriberTwo implements  Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSuscriberTwo :: " + m.getMessageContent());
    }
}
