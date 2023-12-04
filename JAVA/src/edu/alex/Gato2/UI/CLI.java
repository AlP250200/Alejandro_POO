package edu.alex.Gato2.UI;

import edu.alex.Gato2.Game.*;
import edu.alex.Gato2.UI.Idioma.LanguageFactory;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * La clase CLI (Interfaz de Línea de Comandos) maneja la ejecución del juego Tic-Tac-Toe a través de la consola.
 * Proporciona métodos para iniciar, ejecutar y controlar el flujo del juego mediante interacción con el usuario.
 * Ademas hay dos manejo de excepciones para evitar que el usuario ingrese una entrada erronea y evitar que el
 * Programa falle.
 */
public class CLI {
    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        ScoreBoard scoreboard = new ScoreBoard();
        int idiomaSeleccionado= 0;

        while (true) {
            try {
                System.out.println("Seleccione el idioma (Select the language):");
                System.out.println("1. Español");
                System.out.println("2. English");
                idiomaSeleccionado = scanner.nextInt();


                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
        }

        LanguageFactory.setLanguage(idiomaSeleccionado);

        while (true) {
            int gameModeChoice = 0;
            while (true) {
                try {
                    System.out.println(LanguageFactory.getMessage("game_mode"));
                    System.out.println(LanguageFactory.getMessage("Human"));
                    System.out.println(LanguageFactory.getMessage("IA"));

                    gameModeChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (gameModeChoice != 1 && gameModeChoice != 2) {
                        throw new IllegalArgumentException();
                    }

                    break;
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.out.println(LanguageFactory.getMessage("Invalid_choice"));
                    scanner.next();
                }
            }

            Player player1;
            Player player2;

            if (gameModeChoice == 1) {
                System.out.println(LanguageFactory.getMessage("Enter_name_Player"));
                String player1Name = scanner.nextLine();
                player1 = new Player(player1Name, 'X');

                System.out.println(LanguageFactory.getMessage("Enter_name_Player2"));
                String player2Name = scanner.nextLine();
                player2 = new Player(player2Name, 'O');
            } else {
                System.out.println(LanguageFactory.getMessage("Enter_name"));
                String playerName = scanner.nextLine();
                player1 = new Player(playerName, 'X');
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
                System.out.println(player.getName() + ": " + player.getScore() + LanguageFactory.getMessage("Points"));
            }

            System.out.println(LanguageFactory.getMessage("Loop"));
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

}
