package AdapterPattern;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class EnglishLamp {

    /**
     * Lamp that uses a british plug
     */

    private boolean isOn;

    public EnglishLamp() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }
}
