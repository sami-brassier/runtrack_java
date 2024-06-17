import java.util.Scanner;

public class ConvertisseurTemps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une durée en minutes : ");
        int totalMinutes = scanner.nextInt();

        scanner.close();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes est équivalent à " + hours + " heures et " + minutes + " minutes.");
    }
}
