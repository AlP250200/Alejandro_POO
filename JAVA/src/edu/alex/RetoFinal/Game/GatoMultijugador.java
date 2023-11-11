package edu.alex.RetoFinal.Game;

import edu.alex.RetoFinal.Idioma.LanguageFactory;

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
            System.out.println(LanguageFactory.getMessage("TurnPlayer: " + jugadorActual));
            fila = pedirCoordenada(LanguageFactory.getMessage("Row"), scanner);
            columna = pedirCoordenada(LanguageFactory.getMessage("Column"), scanner);

            if (movimientoValido(fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                if (haGanado()) {
                    imprimirTablero();
                    System.out.println(LanguageFactory.getMessage("GameWin") + " " + jugadorActual);
                    break;
                } else if (tableroLleno()) {
                    imprimirTablero();
                    System.out.println(LanguageFactory.getMessage("GameDraw"));
                    break;
                }
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println(LanguageFactory.getMessage("MoveInvalid"));
            }
        }

        scanner.close();
    }

    private int pedirCoordenada(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println(LanguageFactory.getMessage("MoveInvalid"));
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
