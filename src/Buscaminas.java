import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        int[][] tablero = new int[5][5];
        int[][] minas = new int[5][5];
        int minasEncontradas = 0;
        boolean gameOver = false;
        Random rand = new Random();

        // Generar minas aleatorias
        for (int i = 0; i < 5; i++) {
            int minaX = rand.nextInt(5);
            int minaY = rand.nextInt(5);
            minas[minaX][minaY] = 1;
        }

        while (!gameOver) {
            // Imprimir tablero actual
            System.out.println("Tablero 5x5");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (tablero[i][j] == 0);
                }

            }

            // Pedir coordenadas
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese la coordenada X (0-4): ");
            int x = sc.nextInt();
            System.out.print("Ingrese la coordenada Y (0-4): ");
            int y = sc.nextInt();

            // Verificar si hay una mina en la casilla seleccionada
            if (minas[x][y] == 1) {
                System.out.println("BOOOOOOOOOOOM!!!!! ¡Encontraste una mina! ¡Juego Terminado!");
                gameOver = true;
            }

            // Verificar si se encontraron todas las minas
            if (minasEncontradas == 5) {
                System.out.println("¡Felicitaciones! ¡Encontraste todas las minas! ¡Juego Terminado!");
                gameOver = true;
            }
        }
    }
}