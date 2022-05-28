package Examples.Builder;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class CarBuilder implements Builder {
    private String startUpMessage = "Start building the product";//Default start-up message
    private String bodyType = "Steel";//Default body
    private int noOfWheels = 4;//Default number of wheels
    private int noOfHeadLights = 2;//Default number of head lights
    private String endOperationsMessage = "Product creation completed";//Default finish up message
    ProductClass product;

    @Override
    public Builder startUpOperations(String startUpMessage) {
        this.startUpMessage = startUpMessage;
        return this;
    }

    @Override
    public Builder buildBody(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder insertWhels(int numWheels) {
        this.noOfWheels = numWheels;
        return this;
    }

    @Override
    public Builder insertHeadLights(int numHeadLights) {
        this.noOfHeadLights = numHeadLights;
        return this;
    }

    @Override
    public Builder endOperations(String endOperationsMessage) {
        this.endOperationsMessage = endOperationsMessage;
        return this;
    }

    @Override
    public ProductClass constructCar() {
        ProductClass product = new ProductClass(this.startUpMessage, this.bodyType, this.noOfWheels, this.noOfHeadLights, this.endOperationsMessage);
        return product;
    }
}
