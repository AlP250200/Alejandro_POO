package edu.alex.RetoFinal.Game;

import java.util.Scanner;

public class GatoMultijugador extends  Gato{
    public GatoMultijugador( int tamañoTablero) {
        super(tamañoTablero);
    }

    @Override
    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero();
            int fila, columna;
            System.out.println( " Turno del jugador " + jugadorActual);
            fila = pedirCoordenada("Fila: ", scanner);
            columna = pedirCoordenada("Columna: ", scanner);

            if (movimientoValido(fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                if (haGanado()) {
                    imprimirTablero();
                    System.out.println( " ¡El jugador " + jugadorActual + " ha ganado!");
                    break;
                } else if (tableroLleno()) {
                    imprimirTablero();
                    System.out.println( " ¡Es un empate!");
                    break;
                }
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println( " Movimiento no válido. Inténtalo de nuevo.");
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
}
