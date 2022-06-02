package Class_exercises.Exercise_7;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class ConcreteObserver implements Observer {

    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }


    @Override
    public void update(int[] values, int value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                values[i] = -1;
            }
        }
    }

    @Override
    public int update2(int num) {
        System.out.println("You cannot use the value " + num + " anymore");
        return num;
    }

}
