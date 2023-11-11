package edu.alex.reto11.Calculator;
/**
 * La clase Modulo extiende la clase Resta y representa una operación de módulo entre dos números.
 * Esta clase proporciona la funcionalidad para calcular el resultado del módulo y obtener el símbolo
 * de la operación ("%").
 * Usamos dos Override
 */
public class Modulo extends Resta{
    /**
     * Calcula el resultado del módulo entre dos números.
     *
     * Usanddo un override
     *
     * @param num1 El número sobre el cual se calculará el módulo.
     * @param num2 El divisor para el cálculo del módulo.
     * @return El resultado del módulo.
     */
    @Override
    public double calcular(double num1, double num2) {
        if (num2 != 0) {
            while (num1 >= num2) {
                num1 = super.calcular(num1, num2);
            }
            return num1;
        } else {
            System.out.println("Error: Módulo por cero");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación .
     *
     * @return Cadena de texto que representa el símbolo del modulo, que es el signo "%".
     */
    @Override
    public String getSimbolo() {
        return "%";
    }
}
