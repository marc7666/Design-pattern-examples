package Class_exercises.Exercise_12;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public interface HouseBuilder {
    WoodBuilder buildHouse(int floors);

    WoodBuilder buildFloor(int numberOfFloors);

    WoodBuilder buildWalls(int numWalls);

    WoodBuilder buildRoof(int numRoofs);

    HouseMaker make();
}
