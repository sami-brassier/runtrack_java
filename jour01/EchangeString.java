import java.util.Scanner;

public class EchangeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la première chaîne: ");
        String chaine1 = scanner.nextLine();
        System.out.print("Entrez la deuxième chaîne: ");
        String chaine2 = scanner.nextLine();
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());
    }
}
