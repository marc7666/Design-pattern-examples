package Examples.FactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Tiger implements Animal{
    @Override
    public void speak() {
        System.out.println("Hi I'm a tiger");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tiger's preferred action is to hunt");

    }
}
