package Examples.Visitor2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public interface Visitor {
    void accept(SingleDelinquent delinquent);

    void accept(CompisteDelinquent delinquents);
}
