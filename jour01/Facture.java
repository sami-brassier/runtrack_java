public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;

        double tarifHT = prix * quantite;

        double tva = 0.20;

        double montantTVA = tarifHT * tva;

        double tarifTTC = tarifHT + montantTVA;

        System.out.println("Le montant total hors taxe est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + montantTVA);
        System.out.println("Le montant total à payer est : " + tarifTTC);
    }
}
