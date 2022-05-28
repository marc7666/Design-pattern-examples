package Class_exercises.Exercise_1;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Exercise 1 ----------");
        System.out.println("\t\t" + "Section A:");
        Iterator<Object> it = new AdapterA("Hi my name is Marc");
        while (it.hasNext()) {
            System.out.println("Token it: " + it.next());
        }

        System.out.println("--------------------------");
        Iterator<Object> it2 = new AdapterA("I'm studying a bachelor's degree in computer science");
        while (it2.hasNext()){
            System.out.println("Toket it2: " + it2.next());
        }

        System.out.println("--------------------------");
        System.out.println("\t\t" + "Section B:");
        Enumeration<Object> en1 = new AdapterB("Hi my name is Marc");
        while (en1.hasMoreElements()){
            System.out.println("Element en1: " + en1.nextElement());
        }

        System.out.println("--------------------------");
        Enumeration<Object> en2 = new AdapterB("I'm studying a bachelor's degree in computer science");
        while (en2.hasMoreElements()){
            System.out.println("Element en2: " + en2.nextElement());
        }
    }
}
