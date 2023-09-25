package edu.alex.reto3.ui;

import edu.alex.reto3.process.Conversion;

import java.util.Scanner;

/**
 * En esta clase esta la interfaz de linea de comandos donde se muestra lo se mostrará al usuario
 * Contiene un do-while  donde esta el menú que se le mostrará al usuario
 * Además de un switch donde en cada case cumple lo que el usuario solicitó
 */
public class CLI {
    public static void showMenu () {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        /**
         *  En el do-while repite el menú y el switch hasta que el usuario decida parar el bucle
         *  Antes de entrar en el switch el usuario tiene que escoger una opción a convertir
         *  Al escoger la opción a convertir entra al switch y entra al case seleccionado por la opción dada
         *  Para continuar con el bucle el usuario debe escoger la letra s y para detener el bucle y cerrar el
         *  programa escoger la letra n.
         */
        do {
            System.out.println("Menú de conversiones:");
            System.out.println("a. Convertir de decimal a binario");
            System.out.println("b. Convertir de decimal a octal");
            System.out.println("c. Convertir de decimal a hexadecimal");
            System.out.println("d. Convertir de binario a decimal");
            System.out.println("e. Convertir de octal a decimal");
            System.out.println("f. Convertir de hexadecimal a decimal");

            System.out.print("Tipo a convertir: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                /**
                 * En este case se manda a llamar la clase Conversion
                 * Donde se usa el metodo para convertir el numero de decimal a binario
                 */
                case 'a':
                    Conversion.convertirDecimalBinario();
                    break;
                /**
                 * En este case se manda a llamar la clase Conversion
                 * Donde se usa el metodo para convertir el número de decimal a octal
                  */
                case 'b':
                    Conversion.convertirDecimalAOctal();
                    break;
                /**
                 * En este case se manda a llmar la clase Conversion
                 * Donde se usa el metodo para convertir el número de decimal a hexadecimal
                  */
                case 'c':
                    Conversion.convertirDecimalAHexadecimal();
                    break;
                /**
                 * En este case se manda a llmar la clase Conversion
                 * Donde se usa el metodo para convertir el número de binario a decimal
                  */
                case 'd':

                    Conversion.convertirBinarioADecimal();
                    break;
                /**
                 * En este case se manda a llmar la clase Conversion
                 * Donde se usa el metodo para convertir el número de octal a decimal
                 */
                case 'e':
                    Conversion.convertirOctalADecimal();
                    break;
                /**
                 * En este case se manda a llmar la clase Conversion
                 * Donde se usa el metodo para convertir el número de hexadecimal a decimal
                 */
                case 'f':
                    Conversion.convertirHexadecimalADecimal();
                    break;




            }
            System.out.print("¿Deseas realizar otra conversión? (s/n): ");
            opcion = scanner.next().charAt(0);

        } while (opcion == 's');

    }
}


