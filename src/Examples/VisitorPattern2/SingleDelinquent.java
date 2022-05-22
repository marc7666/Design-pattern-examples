package Examples.VisitorPattern2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class SingleDelinquent implements Delinquent {
    private String name;
    private boolean legalAge;
    private int previousCrimes;
    private int economicalFines;
    private int jailCondemnations;

    private boolean arrestedInFraganti;


    public SingleDelinquent(String name, boolean legalAge, int previousCrimes, int economicalFines, int jailCondemnations, boolean arrestedInFraganti) {
        this.name = name;
        this.legalAge = legalAge;
        this.previousCrimes = previousCrimes;
        this.economicalFines = economicalFines;
        this.jailCondemnations = jailCondemnations;
        this.arrestedInFraganti = arrestedInFraganti;
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

    public int getJailCondemnations() {
        return jailCondemnations;
    }

    public boolean isArrestedInFraganti() {
        return arrestedInFraganti;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.accept(this);
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t" + getName() + " is legal age? => " + isLegalAge() + ", has " + getPreviousCrimes() + " crimes in his history, " + "has "
                + getEconomicalFines() + " economical fines, and he has been condemned " + getJailCondemnations() + " times.\n" +
                "The criminal has been arrested in fraganti? => " + isArrestedInFraganti());
    }
}
