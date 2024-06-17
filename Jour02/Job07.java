import java.util.Scanner;

public class Job07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entez un nombre: ");
        int number = scanner.nextInt();
        scanner.close();
        long factorielle = 1;
        for (int i = 1; i <= number; i++) {
            factorielle *= i;
        }
        
        System.out.println("factorielle de " + number + " est " + factorielle);
    }
}
