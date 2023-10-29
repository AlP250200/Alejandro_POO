package edu.alex.Reto10.Process;
/**
 * La clase RaizCuadrada extiende la clase OperacionesAritmeticas y representa una operación de raíz cuadrada.
 * Esta clase proporciona la funcionalidad para calcular la raíz cuadrada de dos números y obtener el símbolo
 * de la operación ("sqrt")
 * Usamos dos Override
 */
public class RaizCuadrada extends OperacionesAritmeticas{
    /**
     * Calcula la raíz cuadrada de dos números.
     *
     * @param num1 El número del cual se calculará la raíz cuadrada.
     * @param num2 El segundo número (no se utiliza en el cálculo de la raíz cuadrada).
     * @return La raíz cuadrada del número num1.
     */
    @Override
    public double calcular(double num1, double num2) {
        double raizNum1 = Math.sqrt(num1);

        return  raizNum1;
    }
    /**
     * Obtiene el símbolo representativo de la operación.
     *
     * @return Cadena de texto que representa el símbolo de la RaizCuadrada, que es el signo "sqrt".
     */

    @Override
    public String getSimbolo() {
        return "sqrt";
    }
}
