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
     * Este metodo sirve para sumar dos números enteros
     */
    public static int sumaEnteros(int num1, int num2) {
    return  num1 + num2;
    }

    /**
     *
     * @param num1 primer operando de la resta
     * @param num2 segundo operando de la resta
     * @return el resultado  de la resta de num1 y num2
     * Este metodo sirve para restar dos números enteros
     */
    public static int restaEnteros(int num1, int num2) {
        return num1 - num2;
    }

    /**
     *
     * @param num1 primer operando de la división
     * @param num2 segundo operando de la división
     * @return el resultado de la división de num1 y num2
     * Este metodo sirve para dividir dos números enteros
     */
    public static int divisionEnteros(int num1, int num2) {
        return num1 / num2;
    }

    /**
     *
     * @param num1 primer operando de la multiplicación
     * @param num2 segundo operando de la multiplicación
     * @return el resultado de la multiplicación de num1 y num2
     * Este metodo sirve para multiplicar dos números enteros
     */
    public static int multiplicacionEnteros(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * @param num1 primer operando del modulo
     * @param num2 segundo operando del modulo
     * @return el resultado del residuo de num1 y num2
     * Este metodo sirve para el residuo de la división de dos números enteros
     */
    public static int moduloEnteros(int num1, int num2) {
        return num1 % num2;
    }
}
