package Examples.ObserverPattern;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 15/05/2022.
 */
public class Message {
    final String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
