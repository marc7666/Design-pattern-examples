package Examples.Builder2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 21/06/2022.
 */
public class Main {
    public static void main(String[] args){
        Person p = new Person.PersonBuilder().name("Marc").age(23).dni("41552189Q").passport(true).drivingLicense(true).build();
        System.out.println(p.toString());
    }
}
