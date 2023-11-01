package edu.alex.Reto10.UI;

import edu.alex.Reto10.Process.*;

import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * La clase CLI (Command Line Interface) proporciona una interfaz de línea de comandos
 * para interactuar con una calculadora aritmética. Permite al usuario realizar operaciones
 * matemáticas básicas como suma, resta, multiplicación, potencia, división, módulo, logaritmo
 * y raíz cuadrada.
 */

public class CLI {
    /**
     * El método runCalculator inicia la calculadora y permite al usuario realizar operaciones
     * aritméticas. Utiliza la entrada estándar y muestra los resultados en la salida estándar.
     * El usuario puede seleccionar diferentes operaciones y proporcionar números para realizar
     * cálculos.
     */
    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        char continuar= 's';
        double num1 =0, num2 =0;

        do {
            System.out.println("Calculadora Aritmética");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Potencia");
            System.out.println("5. División");
            System.out.println("6. Módulo");
            System.out.println("7. Logaritmo");
            System.out.println("8. Raiz Cuadrada");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 8) {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                continue;
            }

            OperacionesAritmeticas operacion = null;


            switch (opcion) {
                case 1:
                    operacion = new Suma();
                    System.out.print("Ingrese el primer número: ");
                     num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                     num2 = scanner.nextDouble();
                    break;
                case 2:
                    operacion = new Resta();
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    break;
                case 3:
                    operacion = new Multiplicacion();
                    System.out.print("Ingrese el número base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el número de veces que se va a sumar: ");
                    num2 = scanner.nextDouble();
                    break;
                case 4:
                    operacion = new Potencia();
                    System.out.print("Ingrese el número base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    break;
                case 5:
                    operacion = new Division();
                    System.out.print("Ingrese el dividendo: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    num2 = scanner.nextDouble();
                    break;
                case 6:
                    operacion = new Modulo();
                    System.out.print("Ingrese el número sobre el cual se calculará el módulo: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el divisor para el cálculo del módulo: ");
                    num2 = scanner.nextDouble();
                    break;
                case 7:
                    operacion = new Logaritmo();
                    System.out.print("Ingrese el número para el logaritmo: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese la base del logaritmo: ");
                    num2 = scanner.nextDouble();
                    break;
                case 8:
                    operacion= new RaizCuadrada();
                    System.out.print("Ingrese el numero que le sacaremos raiz: ");
                    num2 = scanner.nextDouble();
            }



           Resultado resultado = new Resultado(operacion, num1, num2);

            System.out.println(resultado.getOperacion());
            System.out.println("Resultado: " + resultado.getResultado());
            System.out.print("¿Desea continuar (s/o)?: ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'o');

        scanner.close();
    }

}
