package edu.alex.Gato2.Game;

import java.util.Random;

public class IAPlayer  extends Player{
    private Random random;

    public IAPlayer(char symbol) {
        super("Computer", symbol);
        random = new Random();
    }

    public void makeMove(Board board) {
        int size = board.getSize();
        char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';

        // Lógica para ganar
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

        // Lógica para bloquear al oponente
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

        // Lógica para buscar movimiento que lleve al empate
        if (!board.isCellOccupied(1, 1)) {
            board.markCell(1, 1, getSymbol());
            return;
        } else {
            // Si no es posible hacer un movimiento que lleve al empate,
            // buscar un espacio vacío y hacer un movimiento allí.
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

