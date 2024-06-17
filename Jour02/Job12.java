public class Job12 {
    public static void main(String[] args) {
        int Compte = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    System.out.println(i + ", " + j + ", " + k);
                    Compte++;
                }
            }
        }
        System.out.println("Combinaison totale: " + Compte);
    }
}
