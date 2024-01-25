import java.util.Scanner;

public class Factorial {
       
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        long resultat = 0;
      

        
        System.out.print("Introdueix un número :  ");
        numero = scanner.nextInt();
        resultat = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultat);

        scanner.close();
    }

    // Càlcul del factorial
    // Cal verificar la funció.
    public static long calcularFactorial(int n) {

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}