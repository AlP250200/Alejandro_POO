package edu.alex.reto4.process;

import java.util.Scanner;

/**
 * En esta clase contiene todos los metodos para generar el juego solicitado por el usuario
 * En total contiene 4 metodos
 */
public class GameGenerator {
    /**
     * En este metodo solo contiene el arreglo para la palabra del nivel facil
     * A su vez manda a llamar el metodo que contiene la logica del juego
     */
    public static void  beginnerLevel() {
        String[] easyWords = {"lago"};
        GameLogicInitiator(easyWords);
    }

    /**
     * En este metodo solo contiene el arreglo para la palabra del nivel intermedio
     * A su vez manda a llamar el metodo que contiene la logica del juego
     */
    public static void intermediateLevel() {
        String[] intermediateWords = { "television" };
        GameLogicInitiator(intermediateWords);
    }
    /**
     * En este metodo solo contiene el arreglo para la palabra del nivel avanzado
     * A su vez manda a llamar el metodo que contiene la logica del juego
     */
    public static void advancedLevel() {
        String[] advancedWords = {"automatizar"};
        GameLogicInitiator(advancedWords);
    }

    /**
     * Este metodo contiene la logica del juego que lo hace funcional
     * Cambia el arreglo del nivel a un arreglo de caracteres para que el
     * usuario adivine la palabra , para recorrer el nuevo arreglo cambiado se usa
     * un for a su vez para evalular las letras que el usuario ingresa se usa varios if
     * Por ultimo se usa un buble while para los intentos donde se puede equivocar el usuario
     * @param words
     */
    public static void GameLogicInitiator(String[] words) {
        String word = words[(int) (Math.random() * words.length)];
        Scanner scanner = new Scanner(System.in);
        char[] guessedWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '_';
        }

        int attempts = 4;

        while (attempts > 0) {
            System.out.println("Palabra: " + String.valueOf(guessedWord));
            System.out.println("Intentos restantes: " + attempts);
            System.out.print("Ingresa una letra: ");
            char guess = scanner.next().charAt(0);

            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Letra incorrecta.");
            }

            if (String.valueOf(guessedWord).equals(word)) {
                System.out.println("¡Has adivinado la palabra!");
                break;
            }
        }

        if (!String.valueOf(guessedWord).equals(word)) {
            System.out.println("Agotaste tus intentos. La palabra era: " + word);
        }
    }
}
