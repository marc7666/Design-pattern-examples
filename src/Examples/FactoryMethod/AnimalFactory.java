package Examples.FactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public abstract class AnimalFactory {
    public Animal makeAnimal(){
        System.out.println("I'm inside makeAnimal() of AnimalFactory. You cannot ignore my rules");
        Animal animal = createAnimal();
        animal.speak();
        animal.preferredAction();
        return animal;
    }
    public abstract Animal createAnimal();
}
