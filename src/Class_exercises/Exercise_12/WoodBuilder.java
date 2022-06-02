package Class_exercises.Exercise_12;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class WoodBuilder implements HouseBuilder{

    private int floors;
    private int numberOfFloors;
    private int numWalls;
    private int numRoofs;

    @Override
    public WoodBuilder buildHouse(int floors) {
        this.floors = floors;
        return this;
    }

    @Override
    public WoodBuilder buildFloor(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
        return this;
    }

    @Override
    public WoodBuilder buildWalls(int numWalls) {
        this.numWalls = numWalls;
        return this;
    }

    @Override
    public WoodBuilder buildRoof(int numRoofs) {
        this.numRoofs = numRoofs;
        return this;
    }

    @Override
    public HouseMaker make() {
        return new HouseMaker(this.floors, this.numberOfFloors, this.numWalls, this.numRoofs);
    }
}
