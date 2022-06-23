package Examples.AbstractFactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class WildTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("Hi I'm a wild tiger");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild tiger's preferred action is to hunt");
    }
}
