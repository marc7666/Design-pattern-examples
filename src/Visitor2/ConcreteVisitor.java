package Examples.Visitor2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 22/05/2022.
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void accept(SingleDelinquent delinquent) {
        /* A delinquent will be condemned if he or she has at least: (18 years, 3 previous crimes, 12 economical fines and 2 jail condemnations) or has been arrested in fraganti */
        boolean deadCondemnation = (delinquent.isLegalAge() && delinquent.getPreviousCrimes() >= 3 && delinquent.getEconomicalFines() >= 12 &&
                delinquent.getJailCondemnations() >= 2) || delinquent.isArrestedInFraganti();
        System.out.println("\t\t" + delinquent.getName() + " achieves all the mandatory to be condemned to death? => " + deadCondemnation);
    }

    @Override
    public void accept(CompisteDelinquent delinquents) {
        /* A delinquent will be condemned if he or she has at least: (18 years, 3 previous crimes, 12 economical fines and 2 jail condemnations) or has been arrested in fraganti */
        boolean deadCondemnation = (delinquents.isLegalAge() && delinquents.getPreviousCrimes() >= 3 && delinquents.getEconomicalFines() >= 12 &&
                delinquents.getJailCondemnations() >= 2) || delinquents.isArrestedInFraganti();
        System.out.println("\t\t" + delinquents.getName() + " is the head of the criminal organization. Achieves all the mandatory to be condemned to death? => " + deadCondemnation);
    }
}
