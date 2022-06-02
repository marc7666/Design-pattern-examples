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
        Observer myObserver = new ConcreteObserver("Marc");
        c.addObserver(myObserver);

        c.fix_value(2);

        c2 = c.updateValues();
        System.out.println("Cell 1: " + c.toString());
        System.out.println("Cell 2: " + c2.toString());
    }
}
