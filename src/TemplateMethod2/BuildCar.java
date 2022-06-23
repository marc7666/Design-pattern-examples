package Examples.TemplateMethod2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public abstract class BuildCar {
    public void numWheels(int num){
        System.out.println("The car has: " + num + " wheels");
    }

    public void body(String body){
        System.out.println("The material of car's body is: " + body);
    }

    public void engine(int power){
        System.out.println("The thermic engine has: " + power + " HP");
    }

    public abstract void hybrid(int power);

    public abstract void type();
}
