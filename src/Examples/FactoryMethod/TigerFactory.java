package Examples.FactoryMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class TigerFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Tiger();
    }
}
