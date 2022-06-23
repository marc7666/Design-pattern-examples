package Examples.Visitor2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public interface Delinquent {
    void accept(Visitor visitor);

    void printStructures();
}
