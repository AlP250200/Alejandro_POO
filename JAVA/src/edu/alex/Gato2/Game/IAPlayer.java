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

        char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';

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

        int row, col;

        do {
            row = random.nextInt(size);
            col = random.nextInt(size);
        } while (board.isCellOccupied(row, col));

        board.markCell(row, col, getSymbol());
    }
}
