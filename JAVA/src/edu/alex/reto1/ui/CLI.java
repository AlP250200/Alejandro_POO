package edu.alex.reto1.ui;

import edu.alex.reto1.process.Calculator;

import java.util.Scanner;

/**
 * @author Alejandro Pérez
 * Esta clase contiene la interfaz de linea de comando del todo el programa
 * A su vez contiene el menu que se desplegara para el usuario
 **/
public class CLI {
    public static void showMenu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una operacion");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. División");
        System.out.println("4. Multiplicación");
        System.out.println("5. Modulo");
        System.out.println("6. Salir");
        int opcionMenu= scanner.nextInt();

        System.out.println("introduce dato 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Introdece dato 2: ");
         int num2 = scanner.nextInt();
        switch (opcionMenu)
        {
            case 1:
                System.out.println("Se hara la suma de los números:"+ num1 +"+"+num2);
                System.out.println( num1 +"+"+num2+" es igual = " + Calculator.sumaEnteros(num1,num2));

            break;
            case 2:
                System.out.println("Se hara la resta de los números:"+ num1 +"-"+num2);
                System.out.println( num1 +"-"+num2+" es igual = " + Calculator.restaEnteros(num1,num2));
                break;
            case 3:
                System.out.println("Se hara la division de los números:"+ num1 +"/"+num2);
                System.out.println( num1 +"/"+num2+" es igual = " + Calculator.divisionEnteros(num1,num2));
                break;
            case 4:
                System.out.println("Se hara la multiplicación de los números "+ num1+ "*" +num2);
                System.out.println(num1+ "*" +num2+ "es igual = " +Calculator.multiplicacionEnteros(num1,num2));
                break;

            case 5:
                System.out.println("Se sacara el modulo  de los números "+ num1+ "%" +num2);
                System.out.println(num1+ "%" +num2+ "es igual = " +Calculator.moduloEnteros(num1,num2));
                break;
            case 6:
                System.out.println("Gracias por usar la calculadora ");
                break;
            default:
                System.out.println("Introduce una opción correcta");


        }

    }
}
