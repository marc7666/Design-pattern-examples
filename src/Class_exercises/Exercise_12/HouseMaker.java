package Class_exercises.Exercise_12;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class HouseMaker {

    private int floors;
    private int numberOfFloors;
    private int numWalls;
    private int numRoofs;

    public HouseMaker(int floors, int numberOfFloors, int numWalls, int numRoofs) {
        this.floors = floors;
        this.numberOfFloors = numberOfFloors;
        this.numWalls = numWalls;
        this.numRoofs = numRoofs;
    }

    public static WoodBuilder build() {
        return new WoodBuilder();
    }

    @Override
    public String toString() {
        return "HouseMaker{" +
                "floors=" + floors +
                ", numberOfFloors=" + numberOfFloors +
                ", numWalls=" + numWalls +
                ", numRoofs=" + numRoofs +
                '}';
    }
}
