package edu.alex.RetoFinal.Game;

import java.util.Scanner;

public class GatoMultijugador extends  Gato{
    public GatoMultijugador(String idioma, int tamañoTablero) {
        super(idioma, tamañoTablero);
    }

    @Override
    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero();
            int fila, columna;
            System.out.println(idioma + " Turno del jugador " + jugadorActual);
            fila = pedirCoordenada("Fila: ", scanner);
            columna = pedirCoordenada("Columna: ", scanner);

            if (movimientoValido(fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                if (haGanado()) {
                    imprimirTablero();
                    System.out.println(idioma + " ¡El jugador " + jugadorActual + " ha ganado!");
                    break;
                } else if (tableroLleno()) {
                    imprimirTablero();
                    System.out.println(idioma + " ¡Es un empate!");
                    break;
                }
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println(idioma + " Movimiento no válido. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    private int pedirCoordenada(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println(idioma + " Ingrese un número válido.");
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
