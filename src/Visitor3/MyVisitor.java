import java.util.*;

/**
 * @project: Exercici random.
 * @author: mcr99 on 22/06/2022.
 */
public class MyVisitor implements Visitor {
    private List<MachineComponent> brokens = new ArrayList<>();
    private Set<MachineComponent> visited = new HashSet<>();

    @Override
    public void visit(Machine m) {
        visited.add(m);
        if (!visited.contains(m)){
            brokens.add(m);
        }
    }

    @Override
    public void visit(MachineComposite mc) {
        visited.add(mc);
        Iterator<MachineComponent> it = mc.getComponents();
        while (it.hasNext()){
            var next = it.next();
            next.accept(this);
        }

    }
}
