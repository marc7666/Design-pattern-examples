package Class_exercises.Exercise_7;

import Class_exercises.Exercise_7.Exceptions.ValueNotCorrect;

import java.util.Arrays;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Main {
    public static void main(String[] args) throws ValueNotCorrect {
        Cell c = new Cell(4);
        Cell c2 = new Cell(4);
        Cell c3 = new Cell(4);
        Cell c4 = new Cell(4);
        Observer myObserver = new ConcreteObserver("Marc");
        c.addObserver(myObserver);

        c.fix_value(2);

        c2 = c.updateOtherCellsValues();
        c2.addObserver(myObserver);
        c2.fix_value(1);
        c3 = c2.updateOtherCellsValues();
        c3.addObserver(myObserver);
        c3.fix_value(3);
        c4 = c3.updateOtherCellsValues();
        c4.addObserver(myObserver);
        c4.fix_value(4);
        System.out.println("Cell 1: " + c.toString());
        System.out.println("Cell 2: " + c2.toString());
        System.out.println("Cell 3: " + c3.toString());
        System.out.println("Cell 4: " + c4.toString());
    }
}
