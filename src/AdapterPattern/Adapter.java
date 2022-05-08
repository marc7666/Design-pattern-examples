package AdapterPattern;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class Adapter implements Connectable {

    /**
     * Adapter class.
     * From european plug to british plug
     */
    private EnglishLamp eL = new EnglishLamp();

    @Override
    public boolean isOn() {
        return eL.isOn();
    }

    @Override
    public void switchOn() {
        eL.switchOn();
    }

    @Override
    public void switchOff() {
        eL.switchOff();
    }
}
