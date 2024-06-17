import java.util.Scanner;

public class Job08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String numero = scanner.next();
        scanner.close();
        int digitCount = numero.length();
        System.out.println("The number of digits in " + numero + " is: " + digitCount);
    }
}
