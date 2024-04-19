package labJunit.app;

public class Main {

    public static void main( String[] args )
    {
        // Calculatrice
        Calculatrice c = new Calculatrice();

        double s = c.somme(10, 20);
        System.out.println("Le somme de 10 + 20 = " + s);

        double p = c.produit(10, 20);
        System.out.println("Le produit de 10 fois 20 = " + p);


        //Compte bancaire
        CompteBancaire cb = new CompteBancaire();

        double debiter = cb.debiterSolde(1300, 300);
        System.out.println("Le montant a debiter est de 300 euros sur le solde qui est de 1300 euros ce qui fait : " + debiter + " euros");

        double crediter = cb.crediterSolde(1000, 300);
        System.out.println("Le montant a crediter est de 300 euros sur le solde qui est de 1000 euros ce qui fait : " + crediter + " euros");

    }
}
