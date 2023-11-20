package edu.alex.Gato2.Game;

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
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            while (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize() || board.isCellOccupied(row, col)) {
                System.out.println("Invalid move. Try again: ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }

            board.markCell(row, col, currentPlayer.getSymbol());
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    private boolean isGameOver() {
        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(currentPlayer.getName() + " wins!");
            return true;
        } else if (board.isFull()) {
            System.out.println("It's a draw!");
            return true;
        }
        return false;
    }

    private void displayResult() {
        board.display();
        System.out.println("Game over!");

        if (board.isWinner(currentPlayer.getSymbol())) {
            System.out.println(currentPlayer.getName() + " wins!");
            currentPlayer.incrementScore(3); // Incremento de 3 puntos por victoria
        } else if (board.isFull()) {
            System.out.println("It's a draw!");
            player1.incrementScore(1); // Ambos jugadores obtienen 1 punto por empate
            player2.incrementScore(1);
        }
    }
}
