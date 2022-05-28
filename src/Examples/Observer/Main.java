package Examples.Observer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 15/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        MessageSuscriberOne s1 = new MessageSuscriberOne();
        MessageSuscriberTwo s2 = new MessageSuscriberTwo();
        MessageSuscriberThree s3 = new MessageSuscriberThree();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
