package Class_exercises.Segon_parcial_19_20;

import Class_exercises.Segon_parcial_19_20.Exceptions.ConditionsNotAchieved;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class Main {
    public static void main(String[] args) throws ConditionsNotAchieved {
        String body = "Hi Ramon and Jordi, the next 2nd of december I've to formalize the TFG proposal. I want to ask Jordi if he wants to be my TFG coordinator and you Ramon, if you want to" +
                "be my second coordinator.";
        Email email = Email.builder().from("mcr34@alumnes.udl.cat").to("jordi.planes@udl.cat").to("ramon.bejar@udl.cat").subject("TFG").body(body).cctos("magda.valls@udl.cat").make();
        System.out.println(email.toString());
    }
}
