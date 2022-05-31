package Class_exercises.Segon_parcial_19_20;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class Email {
    private final String from;
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> ccTo;

    public Email(
            String from, List<String> to, String subject, String body) {
        this(from, to, subject, body, new ArrayList<>());
    }

    public static EmailBuilder builder() {
        return new EmailBuilder();
    }

    public Email(
            String from, List<String> to, String subject, String body,
            List<String> ccTo) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.ccTo = ccTo;
    }

    @Override
    public String toString() {
        return "Email{ " +
                "from = '" + from + '\'' +
                ", to = " + to +
                ", subject = '" + subject + '\'' +
                ", body = '" + body + '\'' +
                ", ccTo = " + ccTo +
                '}';
    }
}
