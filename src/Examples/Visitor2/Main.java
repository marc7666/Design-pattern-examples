package Examples.Visitor2;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class Main {

    public static void main(String[] args) {

        /* Head of the crime organizations */
        CompisteDelinquent mafia1 = new CompisteDelinquent("Juan", true, 12, 100, 0, false);
        CompisteDelinquent mafia2 = new CompisteDelinquent("Giovanni", true, 1, 2, 0, true);

        /* Mafia1 members */
        SingleDelinquent sd1 = new SingleDelinquent("Antonio", false, 0, 0, 2, false);
        SingleDelinquent sd2 = new SingleDelinquent("Alfonso", true, 33, 0, 12, true);
        SingleDelinquent sd3 = new SingleDelinquent("Candido", true, 12, 60, 5, false);


        /* Mafia2 members */
        SingleDelinquent sd4 = new SingleDelinquent("Pino", false, 13, 0, 9, true);
        SingleDelinquent sd5 = new SingleDelinquent("Francesco", true, 10, 40, 3, false);

        /* Adding the individual delinquents to his corresponding mafia */
        mafia1.addDelinquent(sd1);
        mafia1.addDelinquent(sd2);
        mafia1.addDelinquent(sd3);

        mafia2.addDelinquent(sd4);
        mafia2.addDelinquent(sd5);

        Visitor myVisitor = new ConcreteVisitor();

        List<Delinquent> container = new ArrayList<Delinquent>();

        container.add(mafia1);
        container.add(mafia2);

        for (Delinquent d : mafia1.getCrimeTeam()) {
            container.add(d);
        }
        for (Delinquent d : mafia2.getCrimeTeam()) {
            container.add(d);
        }
        for (Delinquent d : container) {
            d.accept(myVisitor);
        }
    }
}
