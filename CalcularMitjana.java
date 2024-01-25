import java.util.Scanner;

public class CalcularMitjana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sol·licitar a l'usuari la quantitat de nombres
        System.out.print("Introdueix la quantitat de nombres: ");
        int quantitatNombres = scanner.nextInt();

        // Sol·licitar a l'usuari els nombres
        System.out.println("Introdueix els nombres:");
        double suma = 0;
        for (int i = 0; i < quantitatNombres; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        // Calcular la mitjana
        double mitjana = suma / quantitatNombres;

        // Mostrar el resultat
        System.out.println("La mitjana dels nombres introduïts és: " + mitjana);

        // Tancar el scanner
        scanner.close();
    }
}
