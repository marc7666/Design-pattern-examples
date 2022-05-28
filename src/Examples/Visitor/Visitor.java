package Examples.Visitor;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public interface Visitor {
    void visitTheElement(CompositeEmployee employees);
    void visitTheElement(SingleEmplyee employee);
}
