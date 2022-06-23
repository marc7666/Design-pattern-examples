import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @project: Exercici random.
 * @author: mcr99 on 22/06/2022.
 */
public class MachineComposite extends MachineComponent {
    private List<MachineComponent> components = new ArrayList<>();

    public void addComponent(MachineComponent m) {
        components.add(m);
    }

    public Iterator<MachineComponent> getComponents() {
        return components.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
