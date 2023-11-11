package edu.alex.reto12.UI;

import edu.alex.reto12.Calculator.*;
import edu.alex.reto12.Idioma.LanguageFactory;


import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * La clase CLI (Interfaz de Línea de Comando) representa una calculadora interactiva que permite al usuario
 * realizar varias operaciones aritméticas seleccionando un idioma y proporcionando números de entrada.
 */
public class CLI {
    /**
     * Ejecuta la calculadora interactiva que permite al usuario seleccionar un idioma y realizar operaciones aritméticas.
     */
    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';
        double num1 = 0, num2 = 0;

        /**
         * Selección de idioma
         */
        System.out.println("Seleccione el idioma (Select the language):");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. 日本語 ");
        System.out.println("4.Русский");
        System.out.println("5. Português");
        int idiomaSeleccionado = scanner.nextInt();

        /**
         * Configuración del idioma seleccionado
         */

        LanguageFactory.setLanguage(idiomaSeleccionado);
        System.out.print(LanguageFactory.getMessage("Do you want to see the arithmetic operations performed so far? (s/S):"));
        char verOperaciones = scanner.next().charAt(0);
        /**
         * Aqui se hace la pregunta al usuario si quiere ver las operaciones realizadas hasta ese momento en el bloc de
         * Notas
         */

        Path path = Paths.get("operaciones2.txt");

        if (verOperaciones == 's' || verOperaciones == 'S') {
            try {
                Desktop.getDesktop().open(path.toFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        do {
            System.out.println(LanguageFactory.getMessage("welcome"));
            System.out.println(LanguageFactory.getMessage("menu") + LanguageFactory.getMessage("select_option"));

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 8) {
                System.out.println(LanguageFactory.getMessage("invalid_option"));
                continue;
            }

            OperacionesAritmeticas operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new Suma();
                    System.out.print(LanguageFactory.getMessage("enter_first_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_second_number"));
                    num2 = scanner.nextDouble();
                    break;
                case 2:
                    operacion = new Resta();
                    System.out.print(LanguageFactory.getMessage("enter_first_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_second_number"));
                    num2 = scanner.nextDouble();
                    break;
                case 3:
                    operacion = new Multiplicacion();
                    System.out.print(LanguageFactory.getMessage("enter_first_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_second_number"));
                    num2 = scanner.nextDouble();
                    break;
                case 4:
                    operacion = new Potencia();
                    System.out.print(LanguageFactory.getMessage("enter_base_power"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_exponent"));
                    num2 = scanner.nextDouble();
                    break;
                case 5:
                    operacion = new Division();
                    System.out.print(LanguageFactory.getMessage("enter_dividend"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_divisor"));
                    num2 = scanner.nextDouble();
                    break;
                case 6:
                    operacion = new Modulo();
                    System.out.print(LanguageFactory.getMessage("enter_modulo_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_modulo_divisor"));
                    num2 = scanner.nextDouble();
                    break;
                case 7:
                    operacion = new Logaritmo();
                    System.out.print(LanguageFactory.getMessage("enter_logarithm_number"));
                    num1 = scanner.nextDouble();
                    System.out.print(LanguageFactory.getMessage("enter_logarithm_base"));
                    num2 = scanner.nextDouble();
                    break;
                case 8:
                    operacion = new RaizCuadrada();
                    System.out.print(LanguageFactory.getMessage("enter_base"));
                    num1 = scanner.nextDouble();
                    System.out.println(LanguageFactory.getMessage("enter_raiz"));
                    num2 = scanner.nextDouble();

                    break;
            }


            Resultado resultado = new Resultado(operacion, num1, num2);

            System.out.print(LanguageFactory.getMessage("operation_description"));
            System.out.println(resultado.obtenerResultado());
            System.out.println(LanguageFactory.getMessage("result") + resultado.obtenerMensaje());
            /**
             * Aqui vuelve a preguntar cada que se hace una operacion aritmetica y si quiere el usuario abre el archivo
             * txt
             */
            System.out.print(LanguageFactory.getMessage("Do you want to see the arithmetic operations performed so far? (s/S):"));
            verOperaciones = scanner.next().charAt(0);


            if (verOperaciones == 's' || verOperaciones == 'S') {
                try {
                    Desktop.getDesktop().open(path.toFile());
                } catch (IOException e) {
                    e.printStackTrace(); // Maneja la excepción imprimiendo la traza en la consola.
                }
            }




            System.out.println(LanguageFactory.getMessage("continue"));
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
