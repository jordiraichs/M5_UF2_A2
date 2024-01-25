import java.util.Random;
import java.util.Scanner;

public class Buscamines {
    private static final int FILES = 5;
    private static final int COLUMNES = 5;
    private static final int MINES = 3;

    private static char[][] tauler = new char[FILES][COLUMNES];
    private static boolean[][] mines = new boolean[FILES][COLUMNES];;

    public static void inicialitzarTauler() {
        for (int i = 0; i < FILES; i++) {
            for (int j = 0; j < COLUMNES; j++) {
                tauler[i][j] = '-';
            }
        }
    }

    public static void colocarMines() {
        Random random = new Random();
        int minesColocades = 0;

        while (minesColocades < MINES) {
            int fila = random.nextInt(FILES);
            int columna = random.nextInt(COLUMNES);

            mines[fila][columna] = true;
                minesColocades++;
        }
    }
   
    public static void imprimirTauler() {
        for (int i = 0; i < FILES; i++) {
            for (int j = 0; j < COLUMNES; j++) {
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Mètodes addicionals per jugar, descobrir cel·les, etc.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean acabar = false;
        int x,y = 0;

        inicialitzarTauler();
        colocarMines(); // problema d'integració (faltava cridar el mòdul)
        imprimirTauler();
        System.out.print("Inici del joc, mines a trobar : " +  MINES + "\n");

        while (!acabar) {
            System.out.print("Introdueix coordenades: x (9 --> Sortir) = ");
            x = scanner.nextInt();
            System.out.print("Introdueix coordenades: y (9 --> Sortir) = ");
            y = scanner.nextInt();

            if (x == 9 || y == 9){
                acabar = true;
            } else{
            
                if(mines[y][x]==true){
                    tauler[y][x] = 'x';
                } else{
                    tauler[y][x] = 'o';
                }

                imprimirTauler();   
            }
        }
        
        // Tancar el scanner per alliberar recursos
        scanner.close();
    }
}
