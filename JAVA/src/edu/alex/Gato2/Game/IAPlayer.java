package edu.alex.Gato2.Game;

import java.util.Random;

public class IAPlayer extends Player {
    private enum AIState {
        CHECK_WIN,
        BLOCK_OPONENT_WIN,
        RANDOM_MOVE
    }

    private Random random;
    private AIState currentState;

    public IAPlayer(char symbol) {
        super("Computer", symbol);
        random = new Random();
        currentState = AIState.CHECK_WIN;
    }

    public void makeMove(Board board) {
        int size = board.getSize();

        switch (currentState) {
            case CHECK_WIN:
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (!board.isCellOccupied(i, j)) {
                            board.markCell(i, j, getSymbol());
                            if (board.isWinner(getSymbol())) {
                                currentState = AIState.CHECK_WIN; // Stay in the same state for the next move
                                return;
                            }
                            board.markCell(i, j, '-');
                        }
                    }
                }
                currentState = AIState.BLOCK_OPONENT_WIN; // No winning move, transition to the next state
                makeMove(board); // Recur to handle the next state
                break;

            case BLOCK_OPONENT_WIN:
                char opponentSymbol = (getSymbol() == 'X') ? 'O' : 'X';

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (!board.isCellOccupied(i, j)) {
                            board.markCell(i, j, opponentSymbol);
                            if (board.isWinner(opponentSymbol)) {
                                board.markCell(i, j, getSymbol());
                                currentState = AIState.CHECK_WIN; // Transition back to checking for a win
                                return;
                            }
                            board.markCell(i, j, '-');
                        }
                    }
                }
                currentState = AIState.RANDOM_MOVE; // No winning or blocking move, transition to the next state
                makeMove(board); // Recur to handle the next state
                break;

            case RANDOM_MOVE:
                int row, col;

                do {
                    row = random.nextInt(size);
                    col = random.nextInt(size);
                } while (board.isCellOccupied(row, col));

                board.markCell(row, col, getSymbol());
                currentState = AIState.CHECK_WIN; // Transition back to checking for a win
                break;
        }
    }
}