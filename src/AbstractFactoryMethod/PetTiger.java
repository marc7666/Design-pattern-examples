package Examples.AbstractFactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class PetTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Hi I'm a pet tiger");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet tiger's preferred action is to sleep");
    }
}
