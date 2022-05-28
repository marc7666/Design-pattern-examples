package Examples.TemplateMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Template method example ----------");
        BasicEngineering basicEngineering = new ComputerScience();
        System.out.println("Computer science course will be completed in the following order");
        basicEngineering.completeCourse();
        basicEngineering = new Electronics();
        System.out.println("Electronics course will be completed in the following order");
        basicEngineering.completeCourse();
    }
}
