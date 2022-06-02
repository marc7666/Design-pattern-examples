package Class_exercises.Exercise_12;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Main {
    public static void main(String[] args){
        HouseMaker h = HouseMaker.build().buildHouse(12).buildFloor(66).buildWalls(135).buildRoof(1).make();
        System.out.println(h.toString());
    }
}
