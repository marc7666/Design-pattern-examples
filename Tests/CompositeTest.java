import CompositeExample.CompisteEmployee;
import CompositeExample.SimpleEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import CompositeExample.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @project: Software-engineering-II-exercises.
 * @author: mcr99 on 08/05/2022.
 */
public class CompositeTest {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    SimpleEmployee math1;
    SimpleEmployee math2;
    SimpleEmployee cs1;
    SimpleEmployee cs2;
    CompisteEmployee mathHD;
    CompisteEmployee csHD;
    CompisteEmployee principal;

    @BeforeEach
    void main() {
        /*Mathematics teachers*/
        math1 = new SimpleEmployee("Nacho L.", "Maths");
        math2 = new SimpleEmployee("Josep M.", "Maths");

        /*Computer science teachers*/
        cs1 = new SimpleEmployee("Jordi P.", "Computer science");
        cs2 = new SimpleEmployee("Carlos A.", "Computer science");

        /*Department heads*/
        mathHD = new CompisteEmployee("Jaume G", "Maths");
        csHD = new CompisteEmployee("Francesc S.", "Computer science");

        /*College principal*/
        principal = new CompisteEmployee("Magda V.", "Management team");

        /*Math teachers report to Math head department*/
        mathHD.addEmpluyee(math1);
        mathHD.addEmpluyee(math2);

        /*Computer science teachers report to computer science head department*/
        csHD.addEmpluyee(cs1);
        csHD.addEmpluyee(cs2);

        /*Head departments report to the principal*/
        principal.addEmpluyee(mathHD);
        principal.addEmpluyee(csHD);
    }

    @Test
    void controlOverXEmployeesTest() {
        System.out.println(ANSI_GREEN + " ---------- Test before removing ----------");
        System.out.println(ANSI_CYAN + "Testing the control of the principal of the college");
        principal.printStructures();
        System.out.println(ANSI_GREEN + "The principal has control over " + principal.getEmployeeCount() + " employees");
        assertEquals(6, principal.getEmployeeCount());


        System.out.println(ANSI_CYAN + "Testing the control of the head of the math department.");
        mathHD.printStructures();
        System.out.println(ANSI_GREEN + "The mathematics head department has control over " + mathHD.getEmployeeCount() + " employees");
        assertEquals(2, mathHD.getEmployeeCount());

        System.out.println(ANSI_CYAN + "Testing the control of the head of the computer science department.");
        csHD.printStructures();
        System.out.println(ANSI_GREEN + "The computer science head department has control over " + csHD.getEmployeeCount() + " employees");
        assertEquals(2, csHD.getEmployeeCount());

    }

    @Test
    void controlOverXEmployeesAfterRemove() {
        System.out.println(ANSI_GREEN + " ---------- Test after removing ----------");
        System.out.println(ANSI_CYAN + "Testing the control of the principal of the college");
        principal.removeEmployee(mathHD);
        principal.printStructures();
        System.out.println(ANSI_GREEN + "The principal has control over " + principal.getEmployeeCount() + " employees");
        assertEquals(3, principal.getEmployeeCount());


        System.out.println(ANSI_CYAN + "Testing the control of the head of the math department.");
        mathHD.removeEmployee(math1);
        mathHD.printStructures();
        System.out.println(ANSI_GREEN + "The mathematics head department has control over " + mathHD.getEmployeeCount() + " employees");
        assertEquals(1, mathHD.getEmployeeCount());

        System.out.println(ANSI_CYAN + "Testing the control of the head of the computer science department.");
        csHD.removeEmployee(cs1);
        csHD.printStructures();
        System.out.println(ANSI_GREEN + "The computer science head department has control over " + csHD.getEmployeeCount() + " employees");
        assertEquals(1, csHD.getEmployeeCount());

    }
}
