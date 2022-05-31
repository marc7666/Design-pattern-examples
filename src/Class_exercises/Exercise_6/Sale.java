package Class_exercises.Exercise_6;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Sale {
    private List<SLI> lines = new ArrayList<>();

    List<ObserverPull> observers = new ArrayList<>();

    public Sale() {
    }

    public void createSaleLineItem(SLI sli) {
        lines.add(sli);
        notify(sli.getDesc(), sli.getQuantity());
        notify2();

    }

    public void register(ObserverPull o) {
        observers.add(o);
    }

    public void notify(ProductDescription pd, int quantity) {
        for (ObserverPull o : observers) {
            o.update2(pd, quantity);
        }
    }

    public void notify2(){
        for (ObserverPull o : observers){
            o.update4(this);
        }
    }


    public void getLines() {
        for (SLI sli : lines) {
            sli.getSLI();
        }
    }
}
