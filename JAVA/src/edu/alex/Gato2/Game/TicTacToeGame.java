package edu.alex.Gato2.Game;

import edu.alex.Gato2.UI.Idioma.LanguageFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeGame {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private Scanner scanner;
    private IAPlayer iaPlayer;

    public TicTacToeGame(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = board;
        this.scanner = new Scanner(System.in);
        this.iaPlayer = new IAPlayer('O');
    }

    public void play() {
        while (true) {
            board.display();
            makeMove();

            if (isGameOver()) {
                break;
            }

            switchPlayer();
        }

        displayResult();
    }


    private void makeMove() {
        if (currentPlayer instanceof IAPlayer) {
            iaPlayer.makeMove(board);
        } else {
            int row = -1, col = -1;
            boolean isValidInput = false;

            do {
                try {
                    System.out.print(currentPlayer.getName() + " " + LanguageFactory.getMessage("Player's_turn.") + ": ");
                    row = scanner.nextInt() - 1;
                    col = scanner.nextInt() - 1;
                    isValidInput = true;

                    if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize() || board.isCellOccupied(row, col)) {
                        System.out.println(LanguageFactory.getMessage("Invalid_move"));
                        isValidInput = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            } while (!isValidInput);

            board.markCell(row, col, currentPlayer.getSymbol());
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean isGameOver() {
        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(currentPlayer.getName() + " "+ LanguageFactory.getMessage("Win"));
            return true;
        } else if (board.isFull()) {
            System.out.println(LanguageFactory.getMessage("Draw"));
            return true;
        }
        return false;
    }

    private void displayResult() {
        board.display();
        System.out.println("Game over!");

        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(currentPlayer.getName() + " wins!");
            currentPlayer.incrementScore(3);
        } else if (board.isFull()) {
            System.out.println(LanguageFactory.getMessage("Draw"));
            player1.incrementScore(1);
            player2.incrementScore(1);
        }
    }
}
