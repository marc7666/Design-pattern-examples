package Class_exercises.Exercise_6;

import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public interface ObserverPull {
    void update(int subTotal);

    void update2(ProductDescription pd, int quantity);

    void update3(Sale sale, Store store);

    void update4(Sale sale);
}