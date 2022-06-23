package Examples.Adapter;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class Lamp implements Connectable {

    /**
     * Lamp that uses a european plug
     */

    private boolean isOn;

    public Lamp() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void switchOn() {
        this.isOn = true;
    }

    @Override
    public void switchOff() {
        this.isOn = false;
    }
}
