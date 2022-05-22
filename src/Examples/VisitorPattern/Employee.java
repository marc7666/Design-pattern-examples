package Examples.VisitorPattern;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public interface Employee {
    void printStructures();
    void acceptVisitor(Visitor visitor);
}
