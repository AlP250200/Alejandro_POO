package edu.alex.RetoFinal.Game;

import java.util.Random;
import java.util.Scanner;

public class GatoIA  extends Gato{
    public GatoIA( int tamañoTablero) {
        super(tamañoTablero);
    }

    @Override
    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero();
            int fila, columna;

            if (jugadorActual == 'X') {
                System.out.println( " Turno del jugador X");
                fila = pedirCoordenada("Fila: ", scanner);
                columna = pedirCoordenada("Columna: ", scanner);
            } else {
                System.out.println( " Turno del jugador O (IA)");
                if (jugadorActual == 'O') {
                    int[] movimientoIA = movimientoIA();
                    fila = movimientoIA[0];
                    columna = movimientoIA[1];
                } else {
                    int[] movimientoIA = movimientoIA();
                    fila = movimientoIA[0];
                    columna = movimientoIA[1];
                }
            }

            if (movimientoValido(fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                if (haGanado()) {
                    imprimirTablero();
                    System.out.println( " ¡El jugador " + jugadorActual + " ha ganado!");
                    break;
                } else if (tableroLleno()) {
                    imprimirTablero();
                    System.out.println(" ¡Es un empate!");
                    break;
                }
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println(" Movimiento no válido. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    private int pedirCoordenada(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println(" Ingrese un número válido.");
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int[] movimientoIA() {
        Random random = new Random();
        int fila, columna;
        do {
            fila = random.nextInt(tablero.length);
            columna = random.nextInt(tablero.length);
        } while (!movimientoValido(fila, columna));
        return new int[]{fila, columna};
    }
}
