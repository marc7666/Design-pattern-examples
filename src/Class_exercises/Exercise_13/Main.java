package Class_exercises.Exercise_13;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Main {
    public static void main(String[] args){
        String name = "Marc";
        String address = "Carrer de la independencia 1";

        System.out.println("\n" + "***** Fixed factory: *****" + "\n");

        EmployeeFactory employeeFactory = new FixedFactory(name, address, 12L);
        Employee fixed = employeeFactory.makeEmployee();

        System.out.println("\n" + "***** Fixed plus comissions factory: *****" + "\n");
        EmployeeFactory emp2 = new FixedPlusComissionsFactory(name, address, 5d);
        Employee comiss = emp2.makeEmployee();

        System.out.println("\n" + "***** Temporal income factory: *****" + "\n");
        EmployeeFactory emp3 = new TemporalIncomeFactory(name, address, 45L);
        Employee temporal = emp3.makeEmployee();

        System.out.println("\n" + "***** Temporal plus comisions factory: *****" + "\n");
        EmployeeFactory comiss2 = new TemporalPlusComissionsFactory(name, address, 12d);
        Employee emp5 = comiss2.makeEmployee();

        System.out.println("\n" + "***** Staff factory: *****" + "\n");
        EmployeeFactory staff = new StaffIncomeFactory(name, address, 45L);
        Employee emp6 = staff.makeEmployee();

        System.out.println("\n" + "***** Staff plus comisions factory: *****" + "\n");
        EmployeeFactory staffC = new StaffPlusComissionsFactory(name, address, 15d);
        Employee emp7 = staffC.makeEmployee();
    }
}
