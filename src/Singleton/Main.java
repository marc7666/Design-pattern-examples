package Examples.Singleton;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("---------- Singleton pattern example ----------");
        System.out.println("Trying to elect a captain...\n");
        MakeACaptain cap = MakeACaptain.getCaptain();
        System.out.println("Trying to elect another captain\n");
        MakeACaptain cap2 = MakeACaptain.getCaptain();
        if (cap == cap2){
            System.out.println("Both captains are the same person\n");
        }
    }
}
