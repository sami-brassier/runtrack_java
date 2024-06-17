public class Job09 {
    public static void main(String[] args) {
        int nombre = 1234;
        String nombreStr = Integer.toString(nombre);
        char firstDigit = nombreStr.charAt(0);
        char lastDigit = nombreStr.charAt(nombreStr.length() - 1);
        System.out.println("Premier Nombre: " + firstDigit);
        System.out.println("Dernier Nombre: " + lastDigit);
    }
}
