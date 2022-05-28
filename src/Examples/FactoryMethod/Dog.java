package Examples.FactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("Hi I'm a dog.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dog's preferred action is to bark");
    }
}
