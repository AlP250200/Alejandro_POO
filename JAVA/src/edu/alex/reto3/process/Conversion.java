package edu.alex.reto3.process;

import java.util.Scanner;

/**
 * En esta clase contiene los metodos para realizar el programa de conversión de unidades des decimal a binario
 * decimal a octal,decimal a hexadecimal y de binario a decimal, de octal a decimal,de hexadecimal a decimal
 */
public class Conversion {
    /**
     * En este metodo esta la conversión de decimal a binario
     * Como primer paso pide el numero decimal (entero) luego usa funcion que trasforma el numero a base 2(binario)
     * Para terminar muestra al usuario en pantalla el numero decimal y el numero convertido a binario
     */
    public static void convertirDecimalBinario (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int n = scanner.nextInt();

        String bin = Integer.toBinaryString(n);
        System.out.println("Número " + n + " en sistema binario: " + bin);
    }

    /**
     * En este metodo esta la conversión de decimal a octal
     * Como primer paso pide el número decimal (entero) luego usa una función que trasforma el número a base 8 (octal)
     * Para terminar muestra al usuario en pantalla  el número dado (decimal-entero) y el número convertido a octal
     */
    public static void convertirDecimalAOctal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int n = scanner.nextInt();

        String octal = Integer.toOctalString(n);
        System.out.println("Número " + n + " en sistema octal: " + octal);

    }

    /**
     *En este metodo esta la conversión de decimal a hextal
     * Como primer paso pide el numero decumal (entero) luego usa una función que trasforma el numero a base 16 (hextal)
     * Para termimar muestra al usuario en pantalla el número dado (decimal-entero) y el numero convertido a hextal
     */
    public static void convertirDecimalAHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int n = scanner.nextInt();

        String hexa = Integer.toHexString(n);
        System.out.println("Número " + n + " en sistema hexadecimal: " + hexa);
    }

    /**
     * En este metodo esta la conversión de binario a decimal
     * Como primer paso pide el número binario luego usa una función para convertir el número a decimal
     * Para  terminar muestra al usuario en pantall el numero dado(binario) y el número convertido a decimal
     */
    public static void convertirBinarioADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = scanner.nextLine();

        int decimal = Integer.parseInt(binario, 2);


        System.out.println("Número binario " + binario + " en sistema decimal: " + decimal);
    }
    /**En este metodo esta la conversión de octal a decimal
     * Como primer paso pide el número octal luego se usa una función para convertir el número a decimal
     * Para terminar muestra al usuario en pantalla el número dado(octal) y el número convertido a decimal
     */
    public static void convertirOctalADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número octal: ");
        String octal = scanner.nextLine();

        int decimal = Integer.parseInt(octal, 8);


        System.out.println("Número octal " + octal + " en sistema decimal: " + decimal);
    }
    /**En este metodo esta la conversión de hexadecimal a decimal
     * Como primer paso pide el número hexadecimal luego se usa una función para convertir el número a decimal
     * Para terminar muestra al usuarion en pantalla el número dado(hexa) y el número convertido a decimal
     */
    public static void convertirHexadecimalADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número hexadecimal: ");
        String hexadecimal = scanner.nextLine();

        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Número hexadecimal " + hexadecimal + " en sistema decimal: " + decimal);
    }
}
