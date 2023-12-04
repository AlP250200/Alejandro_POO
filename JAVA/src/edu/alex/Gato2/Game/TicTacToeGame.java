package edu.alex.Gato2.Game;

import edu.alex.Gato2.UI.Idioma.LanguageFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * La clase TicTacToeGame representa un juego de Tic Tac Toe que permite a dos jugadores jugar en un tablero
 * y determinar el resultado del juego a su vez tambien permite jugar contra la IA
 */
public class TicTacToeGame {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    private Scanner scanner;
    private IAPlayer iaPlayer;

    /**
     * Constructor para iniciar un juego de Tic Tac Toe con dos jugadores y un tablero.
     * @param player1 El primer jugador
     * @param player2 El segundo jugador
     * @param board El tablero de juego
     */
    public TicTacToeGame(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = board;
        this.scanner = new Scanner(System.in);
        this.iaPlayer = new IAPlayer('O');
    }

    /**
     * Métodos
     */

    /**
     * Inicia y controla el flujo del juego.
     * Muestra el tablero, permite a los jugadores realizar movimientos y verifica si el juego ha terminado.
     */
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

    /**
     * Controla la lógica para que cada jugador realice su movimiento.
     * Si es el turno del jugador IA, realiza un movimiento automáticamente.
     * De lo contrario, espera la entrada del usuario para ingresar su movimiento en el tablero.
     * Incluye un manejo de excepciones para evitar que cuando el usuario ingrese letras en lugar de numeros
     * Muestre el mensaje y le pida de nuevo la entrada
     */
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
    /**
     * Cambia al siguiente jugador.
     */

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    /**
     * Verifica si el juego ha terminado debido a un ganador o si el tablero está lleno (empate).
     * Muestra un mensaje indicando el resultado del juego.
     * @return true si el juego ha terminado, de lo contrario false.
     */
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

    /**
     * Muestra el resultado final del juego, incluyendo el estado final del tablero.
     * Anuncia al ganador o si ha sido un empate.
     * Actualiza los puntajes de los jugadores en consecuencia.
     */

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
