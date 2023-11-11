package edu.alex.reto12.Calculator;

import edu.alex.reto12.Idioma.LanguageFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
        /**
         *  Crea un mensaje formateado con información sobre la operación y su resultado.
         */
        String mensaje = String.format("%s, %s, %s, %s, %s, %s%n",
                operacionStr,
                num1,
                simbolo,
                num2,
                LanguageFactory.getMessage("is"),
                obtenerResultado());

        /**
         *  Utiliza el path deseado antes del try/catch
         */
        Path path = Paths.get("operaciones2.txt");

        try {
            /**
             *  Escribe el mensaje en el archivo, utilizando Files.write con StandardOpenOption.APPEND.
             */
            Files.write(path, mensaje.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mensaje;
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
