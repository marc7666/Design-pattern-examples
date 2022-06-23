package Examples.Singleton;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public final class MakeACaptain {
    private static MakeACaptain captain;
    static int numInstances = 0;

    private MakeACaptain() {
        /* Constructor private to prevent the use of new */
        numInstances++;
        System.out.println("Number of instances at this moment: " + numInstances);
    }

    public static synchronized MakeACaptain getCaptain() {
        if (captain == null) {
            captain = new MakeACaptain();
            System.out.println("A new captain has been elected.\n");
        } else {
            System.out.println("You already have a captain");
        }
        return captain;
    }
}
