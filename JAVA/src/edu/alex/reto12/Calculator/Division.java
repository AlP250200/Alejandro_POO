package edu.alex.reto12.Calculator;
/**
 * La clase Division extiende la clase Resta y representa una operación de división entre dos números.
 * Esta clase proporciona la funcionalidad para calcular el resultado de la división y obtener el símbolo
 * de la operación ("/").
 */
public class Division  extends Resta{
    /**
     * Calcula el resultado de la división entre dos números.
     *
     * Se usa un pverride
     *
     * @param num1 El dividendo.
     * @param num2 El divisor.
     * @return El resultado de la división.
     */
    @Override
    public double calcular(double num1, double num2) {

        if (num2 != 0) {
            double resultado = 0;
            while (num1 >= num2) {
                num1 = super.calcular(num1, num2);
                resultado++;
            }
            return resultado;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación de división.
     *
     * @return Cadena de texto que representa el símbolo de la resta, que es el signo "/".
     */
    @Override
    public String getSimbolo() {
        return "/";
    }
}
