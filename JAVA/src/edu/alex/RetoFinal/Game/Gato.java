package edu.alex.RetoFinal.Game;

public abstract class Gato {
    protected char[][] tablero;
    protected char jugadorActual;


    public Gato( int tamañoTablero) {

        this.tablero = new char[tamañoTablero][tamañoTablero];
        this.jugadorActual = 'X';
        inicializarTablero();
    }

    public abstract void jugar();

    protected void imprimirTablero() {
        System.out.println("\nTablero Actual:");
        for (char[] fila : tablero) {
            for (char c : fila) {
                System.out.print(c);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    protected void inicializarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    protected boolean tableroLleno() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    protected boolean movimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= tablero.length || columna < 0 || columna >= tablero.length) {
            return false;
        }
        return tablero[fila][columna] == ' ';
    }

    protected boolean haGanado() {
        return (ganadorEnFila() || ganadorEnColumna() || ganadorEnDiagonal());
    }

    protected boolean ganadorEnFila() {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][0] == jugadorActual) {
                boolean ganador = true;
                for (int j = 1; j < tablero.length; j++) {
                    if (tablero[i][j] != jugadorActual) {
                        ganador = false;
                        break;
                    }
                }
                if (ganador) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean ganadorEnColumna() {
        for (int j = 0; j < tablero.length; j++) {
            if (tablero[0][j] == jugadorActual) {
                boolean ganador = true;
                for (int i = 1; i < tablero.length; i++) {
                    if (tablero[i][j] != jugadorActual) {
                        ganador = false;
                        break;
                    }
                }
                if (ganador) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean ganadorEnDiagonal() {
        boolean ganadorDiagonal1 = true;
        boolean ganadorDiagonal2 = true;
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][i] != jugadorActual) {
                ganadorDiagonal1 = false;
            }
            if (tablero[i][tablero.length - 1 - i] != jugadorActual) {
                ganadorDiagonal2 = false;
            }
        }
        return ganadorDiagonal1 || ganadorDiagonal2;
    }
}
