package Examples.TemplateMethod;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Electronics extends BasicEngineering {
    @Override
    public void completeSpecialPaper() {
        System.out.println("3.Digital logic and theory circuit");
    }
}
