package edu.alex.RetoFinal.UI;

import edu.alex.RetoFinal.Game.*;

import java.util.Scanner;

public class CLI {
    public  static void runGame(){
        System.out.println("Bienvenido al Juego de Gato");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona el tamaño del tablero (3 o 4):");
        int tamañoTablero = scanner.nextInt();

        if (tamañoTablero != 3 && tamañoTablero != 4) {
            System.out.println("Tamaño de tablero no válido. Elige 3 o 4.");
            return;
        }

        System.out.println("Selecciona el modo de juego (Multijugador o IA):");
        String modoJuego = scanner.next();

        GatoFactory factory;
        if (modoJuego.equalsIgnoreCase("Multijugador")) {
            factory = new GatoMultijugadorFactory();
        } else if (modoJuego.equalsIgnoreCase("IA")) {
            factory = new GatoIAFactory();
        } else {
            System.out.println("Modo de juego no válido. Elige Multijugador o IA.");
            return;
        }

        Gato juego = factory.crearJuego( tamañoTablero);
        juego.jugar();

        scanner.close();
    }
}
