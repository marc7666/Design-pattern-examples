package Examples.AbstractFactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class PetDog implements Dog {

    @Override
    public void speak() {
        System.out.println("Hi I'm a pet dog");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet dog's preferred action is to bark");
    }
}
