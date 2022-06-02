package Class_exercises.Exercise_7;

import Class_exercises.Exercise_7.Exceptions.ValueNotCorrect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Cell {
    private int[] values;

    private int value;

    List<Observer> observers = new ArrayList<>();

    private int possibleValues;

    public Cell(int possibleValues) {
        this.possibleValues = possibleValues;
        this.values = new int[possibleValues];
        fillVector();
        this.value = 0;
    }

    private void fillVector() {
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
    }

    public Cell updateOtherCellsValues() {
        Cell newCell = new Cell(this.possibleValues);
        newCell.setValues(this.getValues());
        return newCell;
    }

    public void fix_value(int num) throws ValueNotCorrect {
        if (isPossible(num) && !isEmpty()) {
            this.value = num;
            notifyObservers(num);
        } else {
            throw new ValueNotCorrect("This value is incorrect");
        }

    }

    public boolean isEmpty() {
        for (int i = 0; i < this.values.length; i++) {
            if (values[i] != -1) {
                return false;
            }
        }
        return true;
    }

    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    private void notifyObservers(int valueToRemove) {
        for (Observer o : observers) {
            o.update(this.values, valueToRemove);
        }
    }

    private boolean isPossible(int num) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == num) {
                return true;
            }
        }
        return false;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
