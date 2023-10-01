package edu.alex.reto6.ui;

import edu.alex.reto6.process.GameGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase esta la interfaz que se le mostrara al usuario a su vez manda a llmar la clase
 * GameGenerator, a su vez esta clase contiene un metodo llamado ShowMenu
 */
public class CLI {
    /**
     * En este metodo contiene un do while este hace que el progrmaa corra al menos una vez y
     * se detiene hasta que el usuario decida terminar a su vez adentro del do while  esta un
     * menu donde muestra las opciones de nivel además de un swicth en donde cada case
     *  manda a llmar la clase GameGenerator y sus metodos
     *  Se agrega una excepción para cuando el usuario ingrese una opcion no valida de los niveles
     *  Ademas de un mensjae de guia para que el usuario sepa de su error
     */
    public static void ShowMenu () {
        Scanner scanner = new Scanner(System.in);

        int opciones=0;
        do {
            try {
                System.out.println("=== Juego de Adivinanza de Palabras ===");
                System.out.println("1. Nivel Fácil");
                System.out.println("2. Nivel Intermedio");
                System.out.println("3. Nivel Avanzado");
                System.out.println("0. Salir");
                System.out.print("Selecciona un nivel o presiona 0 para salir: ");
                opciones = scanner.nextInt();

                switch (opciones) {
                    case 1:
                        GameGenerator.beginnerLevel();
                        break;
                    case 2:
                        GameGenerator.intermediateLevel();
                        break;
                    case 3:
                        GameGenerator.advancedLevel();
                        break;
                    case 0:
                        System.out.println("Gracias por jugar. ¡Hasta luego!");
                        break;
                    default:
                        throw new IllegalArgumentException("Opción no válida. Por favor, selecciona un nivel válido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                scanner.next(); // Limpiar el búfer de entrada
                opciones = -1; // Establecer un valor inválido para volver a solicitar la entrada
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opciones != 0);
    }
    }



