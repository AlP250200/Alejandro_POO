package edu.alex.RetoFinal.UI;

import edu.alex.RetoFinal.Game.*;
import edu.alex.RetoFinal.Idioma.LanguageFactory;

import java.util.Scanner;

public class CLI {
    public static void runGame() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Select language (1 for Spanish, 2 for English, 3 for Japanese):");
            int languageOption = scanner.nextInt();
            LanguageFactory.setLanguage(languageOption);

            System.out.println(LanguageFactory.getMessage("welcome"));
            System.out.println(LanguageFactory.getMessage("board"));
            int boardSize = scanner.nextInt();

            if (boardSize != 3 && boardSize != 4) {
                System.out.println(LanguageFactory.getMessage("boardError"));
                continue;
            }

            System.out.println(LanguageFactory.getMessage("ModeGame"));
            int gameMode = scanner.nextInt();

            GatoFactory factory;

            if (gameMode == 1) {
                factory = new GatoMultijugadorFactory();
            } else if (gameMode == 2) {
                factory = new GatoIAFactory();
            } else {
                System.out.println(LanguageFactory.getMessage("ModeGameError"));
                continue;
            }

            Gato game = factory.crearJuego(boardSize);

            if (gameMode == 2) {
                game.jugar();
            } else {
                System.out.println(LanguageFactory.getMessage("StartGame"));
                int startGame = scanner.nextInt();
                if (startGame == 1) {
                    game.jugar();
                }
            }

            System.out.println(LanguageFactory.getMessage("PlayAgain"));

        } while (scanner.next().equalsIgnoreCase("s"));

        scanner.close();



    }
}
