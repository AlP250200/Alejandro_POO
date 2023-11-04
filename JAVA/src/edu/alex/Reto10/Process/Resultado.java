package edu.alex.Reto10.Process;

import java.util.ArrayList;
/**
 * Clase que representa un resultado de una operación aritmética.
 */
public class Resultado {
    private String operacion;
    private double resultado;
    /**
     * Constructor de la clase Resultado.
     *
     * @param op   El objeto OperacionesAritmeticas que representa la operación realizada.
     * @param num1 El primer número de la operación.
     * @param num2 El segundo número de la operación.
     */

    public Resultado(OperacionesAritmeticas op, double num1, double num2) {
        this.operacion = obtenerMensaje(op, num1, num2);
        this.resultado = op.calcular(num1, num2);
    }
    /**
     * Obtiene la representación de la operación y el resultado en un formato legible.
     *
     * @return Cadena de texto que describe la operación y su resultado.
     */

    public String getOperacion() {
        return operacion;
    }
    /**
     * Obtiene el resultado de la operación.
     *
     * @return El resultado numérico de la operación.
     */
    public double getResultado() {
        return resultado;
    }
    /**
     * Método estático para obtener un mensaje descriptivo de la operación realizada.
     *
     * @param op   El objeto OperacionesAritmeticas que representa la operación realizada.
     * @param num1 El primer número de la operación.
     * @param num2 El segundo número de la operación.
     * @return Cadena de texto que describe la operación y su resultado.
     */
    public static String obtenerMensaje(OperacionesAritmeticas op, double num1, double num2) {
        return op.getClass().getSimpleName() + " " + num1 + " " + op.getSimbolo() + " " + num2 + " es: " + op.calcular(num1, num2);
    }

}
