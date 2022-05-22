package Examples.VisitorPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class CompisteDelinquent implements Delinquent {

    private String name;
    private boolean legalAge;
    private int previousCrimes;
    private int economicalFines;
    private int jailCondemnations;
    private List<Delinquent> crimeTeam;

    private boolean arrestedInFraganti;

    public CompisteDelinquent(String name, boolean legalAge, int previousCrimes, int economicalFines, int jailCondemnations, boolean arrestedInFraganti) {
        this.name = name;
        this.legalAge = legalAge;
        this.previousCrimes = previousCrimes;
        this.economicalFines = economicalFines;
        this.jailCondemnations = jailCondemnations;
        this.crimeTeam = new ArrayList<>();
        this.arrestedInFraganti = arrestedInFraganti;
    }

    public void addDelinquent(Delinquent delinquent) {
        crimeTeam.add(delinquent);
    }

    public void removeDelinquent(Delinquent delinquent) {
        crimeTeam.remove(delinquent);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.accept(this);
    }

    public String getName() {
        return name;
    }

    public boolean isLegalAge() {
        return legalAge;
    }

    public int getPreviousCrimes() {
        return previousCrimes;
    }

    public int getEconomicalFines() {
        return economicalFines;
    }

    public boolean isArrestedInFraganti() {
        return arrestedInFraganti;
    }

    public int getJailCondemnations() {
        return jailCondemnations;
    }

    public List<Delinquent> getCrimeTeam() {
        return crimeTeam;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + "is the head of the criminal team. He's in legal age? =>" + isLegalAge() + ". Has: " + getEconomicalFines() +
                " economical fines,\n" + getPreviousCrimes() + " previous crimes,\n" + getJailCondemnations() + "jail condemnations,\n" + "and his crime mates are:\n");
        for (Delinquent d : crimeTeam) {
            d.printStructures();
        }
        System.out.println("\n" + getName() + " has been arrested in fraganti? => " + isArrestedInFraganti());

    }
}
