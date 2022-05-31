package Class_exercises.Exercise_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Register {
    private Store tenda;
    private Sale currentSale;

    public Register(Store tenda) {
        this.tenda = tenda;
    }


    public Sale getCurrentSale() {
        return currentSale;
    }

    public void createNewSale() {
        currentSale = new Sale();
    }

    public void getRegister() {
        System.out.println("Store: " + tenda.getName() + " current sale: ");
        currentSale.getLines();
    }
}
