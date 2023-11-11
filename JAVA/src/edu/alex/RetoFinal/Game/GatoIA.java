package edu.alex.RetoFinal.Game;

import edu.alex.RetoFinal.Idioma.LanguageFactory;

import java.util.Random;
import java.util.Scanner;

public class GatoIA  extends Gato{
    public GatoIA(int tamañoTablero) {
        super(tamañoTablero);
        Random random = new Random();
        jugadorActual = random.nextBoolean() ? 'O' : 'X';
    }

    @Override
    public void jugar() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero();

            if (jugadorActual == 'O') {
                System.out.println(LanguageFactory.getMessage("TurnIA"));
                int[] movimientoIA = movimientoIA();
                int fila = movimientoIA[0];
                int columna = movimientoIA[1];
                if (movimientoValido(fila, columna)) {
                    tablero[fila][columna] = jugadorActual;
                    if (haGanado()) {
                        imprimirTablero();
                        System.out.println(LanguageFactory.getMessage("GameWin"));
                        break;
                    } else if (tableroLleno()) {
                        imprimirTablero();
                        System.out.println(LanguageFactory.getMessage("GameDraw"));
                        break;
                    }
                }
            } else if (jugadorActual == 'X') {
                System.out.println(LanguageFactory.getMessage("TurnPlayer"));
                int fila = pedirCoordenada("Row: ", scanner);
                int columna = pedirCoordenada("Column: ", scanner);
                if (movimientoValido(fila, columna)) {
                    tablero[fila][columna] = jugadorActual;
                    if (haGanado()) {
                        imprimirTablero();
                        System.out.println(LanguageFactory.getMessage("GameWin"));
                        break;
                    } else if (tableroLleno()) {
                        imprimirTablero();
                        System.out.println(LanguageFactory.getMessage("GameDraw"));
                        break;
                    }
                } else {
                    System.out.println(LanguageFactory.getMessage("MoveInvalid"));
                }
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private int pedirCoordenada(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println(LanguageFactory.getMessage("MoveValid"));
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
