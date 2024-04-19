package labJunit.app;

public class CompteBancaire {

    public CompteBancaire() {
        System.out.println("\nVoici mon compte bancaire");
    }

    public double debiterSolde(double solde, double montantDebiter) {
        return solde - montantDebiter;
    }

    public double crediterSolde(double solde, double montantCrediter) {
        return solde + montantCrediter;
    }
}
