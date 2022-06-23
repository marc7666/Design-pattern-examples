package Examples.Composite;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class CompositePattern {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    /**
     * Principal is in the top of college.
     * Department heads directly reports to hom.
     * Teachers of computer science directly report to computer science department head
     * Teachers of mathematics directly report to mathematics department head
     * */

    public static void main(String[] args){
        System.out.println(ANSI_RED + "********** Composite pattern example **********");

        /*Mathematics teachers*/
        SimpleEmployee math1 = new SimpleEmployee("Nacho L.", "Maths");
        SimpleEmployee math2 = new SimpleEmployee("Josep M.", "Maths");

        /*Computer science teachers*/
        SimpleEmployee cs1 = new SimpleEmployee("Jordi P.", "Computer science");
        SimpleEmployee cs2 = new SimpleEmployee("Carlos A.", "Computer science");

        /*Department heads*/
        CompisteEmployee mathHD = new CompisteEmployee("Jaume G", "Maths");
        CompisteEmployee csHD = new CompisteEmployee("Francesc S.", "Computer science");

        /*College principal*/
        CompisteEmployee principal = new CompisteEmployee("Magda V.", "Management team");

        /*Math teachers report to Math head department*/
        mathHD.addEmpluyee(math1);
        mathHD.addEmpluyee(math2);

        /*Computer science teachers report to computer science head department*/
        csHD.addEmpluyee(cs1);
        csHD.addEmpluyee(cs2);

        /*Head departments report to the principal*/
        principal.addEmpluyee(mathHD);
        principal.addEmpluyee(csHD);

        System.out.println(ANSI_RED + " ---------- Test before removing ----------");
        System.out.println(ANSI_CYAN + "Testing the control of the principal of the college");
        principal.printStructures();
        System.out.println(ANSI_GREEN + "The principal has control over " + principal.getEmployeeCount() + " employees");


        System.out.println(ANSI_CYAN + "Testing the control of the head of the math department.");
        mathHD.printStructures();
        System.out.println(ANSI_GREEN + "The mathematics head department has control over " + mathHD.getEmployeeCount() + " employees");

        System.out.println(ANSI_CYAN + "Testing the control of the head of the computer science department.");
        csHD.printStructures();
        System.out.println(ANSI_GREEN + "The computer science head department has control over " + csHD.getEmployeeCount() + " employees");

        System.out.println(ANSI_RED + " ---------- Test after removing ----------");
        System.out.println(ANSI_CYAN + "Testing the control of the principal of the college");
        principal.removeEmployee(mathHD);
        principal.printStructures();
        System.out.println(ANSI_GREEN + "The principal has control over " + principal.getEmployeeCount() + " employees");


        System.out.println(ANSI_CYAN + "Testing the control of the head of the math department.");
        mathHD.removeEmployee(math1);
        mathHD.printStructures();
        System.out.println(ANSI_GREEN + "The mathematics head department has control over " + mathHD.getEmployeeCount() + " employees");

        System.out.println(ANSI_CYAN + "Testing the control of the head of the computer science department.");
        csHD.removeEmployee(cs1);
        csHD.printStructures();
        System.out.println(ANSI_GREEN + "The computer science head department has control over " + csHD.getEmployeeCount() + " employees");
    }
}
