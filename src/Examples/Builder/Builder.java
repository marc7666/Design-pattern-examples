package Examples.Builder;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public interface Builder {
    Builder startUpOperations(String startUpMessage);

    Builder buildBody(String bodyType);

    Builder insertWhels(int numWheels);

    Builder insertHeadLights(int numHeadLights);

    Builder endOperations(String endOperationsMessage);

    ProductClass constructCar();
}
