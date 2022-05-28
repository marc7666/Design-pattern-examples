package Examples.Builder;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class ProductClass {
    private String startUpMessage;
    private String bodyType;
    private int wheels;
    private int numHeadLights;
    private String endOperationsMessage;


    public ProductClass(final String startUpMessage, String bodyType, int wheels, int numHeadLights, String endOperationsMessage) {
        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.wheels = wheels;
        this.endOperationsMessage = endOperationsMessage;
        this.numHeadLights = numHeadLights;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "startUpMessage = '" + startUpMessage + '\'' +
                ", bodyType = '" + bodyType + '\'' +
                ", wheels = " + wheels +
                ", numHeadLights = " + numHeadLights +
                ", endOperationsMessage = '" + endOperationsMessage + '\'' +
                '}';
    }
}
