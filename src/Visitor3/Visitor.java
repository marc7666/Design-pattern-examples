/**
 * @project: Exercici random.
 * @author: mcr99 on 22/06/2022.
 */
public interface Visitor {
    void visit(Machine m);

    void visit(MachineComposite mc);
}
