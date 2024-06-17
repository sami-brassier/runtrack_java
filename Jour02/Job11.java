import java.util.Scanner;

public class Job11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entez hauteur triangle: ");
        int hauteur = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
