package edu.alex.Gato2.UI;

import edu.alex.Gato2.Game.*;

import java.util.List;
import java.util.Scanner;

public class CLI {
    public static void runGame() {
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
            scanner.nextLine();

            Player player1 = new Player(playerName, 'X');
            Player player2;

            if (gameModeChoice == 1) {
                System.out.println("Enter Player 2's name: ");
                String player2Name = scanner.nextLine();
                player2 = new Player(player2Name, 'O');
            } else {
                player2 = new IAPlayer('O');
            }

            Board board = new Board(3);
            TicTacToeGame game = new TicTacToeGame(player1, player2, board);
            game.play();

            scoreboard.updateScore(player1);
            scoreboard.updateScore(player2);
            scoreboard.saveScoresToFile();
            scoreboard.displayRankings();

            System.out.println("Scores:");
            List<Player> rankedPlayers = scoreboard.getRankedPlayers();
            for (Player player : rankedPlayers) {
                System.out.println(player.getName() + ": " + player.getScore() + " points");
            }

            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();

    }
}
