package edu.alex.reto11.Calculator;

import edu.alex.reto11.Lenguaje.LanguageFactory;

/**
 * La clase `Resultado` representa el resultado de una operación aritmética,
 * incluyendo la operación en sí, dos operandos y métodos para calcular el resultado
 * y generar un mensaje descriptivo.
 */
public class Resultado {
    private OperacionesAritmeticas operacion;
    private double num1;
    private double num2;
    /**
     * Constructor para crear un objeto `Resultado`.
     *
     * @param op    La operación aritmética a realizar.
     * @param num1  El primer operando.
     * @param num2  El segundo operando.
     *//**
     * Calcula y devuelve el resultado de la operación aritmética.
     *
     * @return El resultado de la operación.
     */
    public Resultado(OperacionesAritmeticas op, double num1, double num2) {
        this.operacion = op;
        this.num1 = num1;
        this.num2 = num2;
    }
    /**
     * Genera un mensaje descriptivo para la operación aritmética y su resultado.
     *
     * @return Un mensaje que describe la operación y el resultado.
     */

    public double obtenerResultado() {
        return operacion.calcular(num1, num2);
    }

    public String obtenerMensaje() {
        String simbolo = operacion.getSimbolo();
        String operacionStr = obtenerDescripcionOperacion(simbolo);
        return operacionStr + " " + num1 + " " + simbolo + " " + num2 + LanguageFactory.getMessage("is") + obtenerResultado();
    }
    /**
     * Obtiene una descripción legible por humanos de la operación aritmética basada en el símbolo del operador.
     *
     * @param simbolo El símbolo del operador.
     * @return Una descripción de la operación.
     */

    private String obtenerDescripcionOperacion(String simbolo) {
        switch (simbolo) {
            case "+":
                return LanguageFactory.getMessage("Adding");
            case "-":
                return LanguageFactory.getMessage("Subtracting");
            case "*":
                return LanguageFactory.getMessage("Multiplying");
            case "/":
                return LanguageFactory.getMessage("Dividing");
            case "%":
                return LanguageFactory.getMessage("Calculating the modulus of");
            case "log":
                return LanguageFactory.getMessage("Calculating the logarithm of: ");
            case "^":
                return LanguageFactory.getMessage("Raising");
            case "sqrt":
                return LanguageFactory.getMessage("Calculating the square root of: ");
            default:
                return "Realizando operación";
        }
    }


    }


