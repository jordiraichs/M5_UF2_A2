public class DeterminarSigne {

    // Prova de la funció determinarSigne
    // Assegurar-nos que provem totes les línies de codi
    public static String determinarSigne(int numero) {
        if (numero > 0) {
            return "Positiu";
        } else if (numero < 0) {
            return "Negatiu";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        // Prova amb un valor positiu
        int valorPositiu = 5;
        String resultatPositiu = determinarSigne(valorPositiu);
        System.out.println("Per al valor " + valorPositiu + ": " + resultatPositiu);

    }
}
