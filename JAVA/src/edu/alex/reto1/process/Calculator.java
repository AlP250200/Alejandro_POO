package edu.alex.reto1.process;


/**
 * @author Alejandro Pérez
 * Esta clase contiene la logicas de las opereciones basicas aritmeticas
 * suma, resta , multipiplicacion, y modulo
 **/
public class Calculator {
    /**
     *
     * @param num1 primer operando de la suma
     * @param num2 segundo operando de la suma
     * @return el resultado de la suma de num1 y num2
     * Este metodo sirve para sumar dos numeros enteros
     */
    public static int sumaEnteros(int num1, int num2) {
    return  num1 + num2;
    }

    /**
     *
     * @param num1 primer operando de la resta
     * @param num2 segundo operando de la resta
     * @return el resultado de
     */
    public static int restaEnteros(int num1, int num2) {
        return num1 - num2;
    }
    public static int divisionEnteros(int num1, int num2) {
        return num1 / num2;
    }
    public static int multiplicacionEnteros(int num1, int num2) {
        return num1 * num2;
    }
    public static int moduloEnteros(int num1, int num2) {
        return num1 % num2;
    }
}
