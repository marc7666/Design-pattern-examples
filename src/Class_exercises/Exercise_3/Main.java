package Class_exercises.Exercise_3;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 29/05/2022.
 */
public class Main {
    public static void main(String[] args){
        Node n1 = new Node(12);

        n1.add(5);
        n1.add(15);
        n1.add(1);
        n1.add(6);
        n1.add(13);
        n1.add(17);

        n1.printPreOrder();
        int suma = n1.sumNodes();
        System.out.println("Total sum = " + suma);
    }
}
