package edu.alex.Gato2.Game;

import java.util.Random;
/**
 * La clase IAPlayer representa a un jugador controlado por la inteligencia artificial (IA).
 * Realiza movimientos en el juego de acuerdo con una lógica predefinida.
 */
public class IAPlayer  extends Player{

    /**
     * Constructor para crear un jugador controlado por la inteligencia artificial.
     * @param symbol El símbolo que representa al jugador (X o O)
     */
    public IAPlayer(char symbol) {
        super("Computer", symbol);
    }

    /**
     * Realiza un movimiento en el tablero utilizando la lógica de la inteligencia artificial.
     * @param board El tablero de juego en el que se realizará el movimiento
     */

    public void makeMove(Board board) {
        int size = board.getSize();
        char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';

        /**
         *  1. Intenta ganar el juego marcando una celda para obtener una victoria inmediata
          */


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!board.isCellOccupied(i, j)) {
                    board.markCell(i, j, getSymbol());
                    if (board.isWinner(getSymbol())) {
                        return;
                    }
                    board.markCell(i, j, '-');
                }
            }
        }
        /**
         * 2. Bloquea al oponente para evitar que gane en el siguiente movimiento
         */

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!board.isCellOccupied(i, j)) {
                    board.markCell(i, j, opponentSymbol);
                    if (board.isWinner(opponentSymbol)) {
                        board.markCell(i, j, getSymbol());
                        return;
                    }
                    board.markCell(i, j, '-');
                }
            }
        }
        /**
         * 3. Marca el centro si está disponible para priorizar el control del tablero
         * En caso contrario realiza movimientos aleatorios
         */

        if (!board.isCellOccupied(1, 1)) {
            board.markCell(1, 1, getSymbol());
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (!board.isCellOccupied(i, j)) {
                        board.markCell(i, j, getSymbol());
                        return;
                    }
                }
            }
        }
    }
}

