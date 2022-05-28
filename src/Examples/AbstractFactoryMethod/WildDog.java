package Examples.AbstractFactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Hi I'm a wild dog");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild dog's preferred action is to bite");
    }
}
