package edu.alex.Gato2.UI;

import edu.alex.Gato2.Game.*;

import java.util.List;
import java.util.Scanner;

public class CLI {
    public static void runGame(){
        Scanner scanner = new Scanner(System.in);
        ScoreBoard scoreboard = new ScoreBoard();


        while (true) {
            System.out.println("Welcome to Tic-Tac-Toe!");
            System.out.println("Select language / Selecciona idioma:");
            System.out.println("1. English");
            System.out.println("2. Español");

            int languageChoice = scanner.nextInt();
            scanner.nextLine(); // Consume el newline

            String playerName;
            if (languageChoice == 1) {
                System.out.println("Enter your name: ");
            } else {
                System.out.println("Ingresa tu nombre: ");
            }
            playerName = scanner.nextLine();

            System.out.println("Select game mode / Selecciona modo de juego:");
            System.out.println("1. Player vs. Player");
            System.out.println("2. Player vs. Computer");

            int gameModeChoice = scanner.nextInt();

            // Creación de instancias de jugador, tablero y juego
            Player player1 = new Player(playerName, 'X');
            Player player2 = (gameModeChoice == 1) ? new Player("Player 2", 'O') : new IAPlayer('O');
            Board board = new Board(3); // Tamaño predeterminado del tablero 3x3

            TicTacToeGame game = new TicTacToeGame(player1, player2, board);
            game.play();

            // Save the scores to a file
            scoreboard.updateScore(player1);
            scoreboard.updateScore(player2);
            scoreboard.saveScoresToFile();
            scoreboard.displayRankings();


            // Display scores
            System.out.println("Scores:");
            List<Player> rankedPlayers = scoreboard.getRankedPlayers();
            for (Player player : rankedPlayers) {
                System.out.println(player.getName() + ": " + player.getScore() + " points");
            }

            // Preguntar al usuario si quiere jugar de nuevo
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;  // Salir del bucle si no se desea jugar nuevamente
            }
        }

        // Cerrar el Scanner al salir del bucle
        scanner.close();
    }

    }

