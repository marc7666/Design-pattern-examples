/**
 * @project: Exercici random.
 * @author: mcr99 on 22/06/2022.
 */
public class Machine extends MachineComponent {
    public void setBroken() {
        broken = true;
    }

    public void repair() {
        broken = false;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
