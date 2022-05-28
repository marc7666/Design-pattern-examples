package Examples.FactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("---------- Factory method example ----------");
        AnimalFactory tigerFactory = new TigerFactory();
        Animal tiger = tigerFactory.makeAnimal();

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.makeAnimal();

    }
}
