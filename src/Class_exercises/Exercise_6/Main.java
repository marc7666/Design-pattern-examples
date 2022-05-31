package Class_exercises.Exercise_6;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        Store store1 = new Store("Zara");

        ProductDescription p1 = new ProductDescription("Shirt", 40);
        ProductDescription p2 = new ProductDescription("Pants", 39);
        ProductDescription p3 = new ProductDescription("Socks", 15);

        SLI sli1 = new SLI(p1, 2);
        SLI sli2 = new SLI(p2, 4);
        SLI sli3 = new SLI(p3, 10);


        ConcreteObserverPull myObserver1 = new ConcreteObserverPull("Marc");
        Register reg1 = new Register(store1);
        reg1.createNewSale();
        Sale sale1 = reg1.getCurrentSale();

        sale1.register(myObserver1);
        sli1.register(myObserver1);
        sli2.register(myObserver1);
        sli3.register(myObserver1);

        sale1.createSaleLineItem(sli1);
        int subtotal1 = sli1.subTotal();
        sale1.createSaleLineItem(sli2);
        int subtotal2 = sli2.subTotal();
        sale1.createSaleLineItem(sli3);
        int subtotal3 = sli3.subTotal();




    }
}
