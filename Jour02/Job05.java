import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre âge: ");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("Jeune");
        } else if (age > 55) {
            if (age == 67) {
                System.out.println("Retraite");
            } else {
                System.out.println("Difficulté");
            }
        } else {
            System.out.println("Peut travailler");
        }
        
        scanner.close();
    }
}
