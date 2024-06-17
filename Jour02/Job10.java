public class Job10 {
    public static void main(String[] args) {
        int nombre = 1234;
        int somme = 0;
        while (nombre != 0) {
            somme += nombre % 10;
            nombre /= 10;
        }
        System.out.println("Somme: " + somme);
    }
}
