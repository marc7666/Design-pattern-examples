/**
 * @project: Exercici random.
 * @author: mcr99 on 22/06/2022.
 */
public abstract class MachineComponent {
    protected boolean broken = false;
    public final boolean isBroken(){
        return broken;
    }

    public abstract void accept(Visitor v);

}
