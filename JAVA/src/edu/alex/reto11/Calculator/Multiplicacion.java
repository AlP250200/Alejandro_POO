package edu.alex.reto11.Calculator;
/**
 * La clase Multiplicacion extiende la clase Suma y representa una operación de multiplicación entre dos números.
 * Esta clase proporciona la funcionalidad para calcular el resultado de la multiplicación y obtener el símbolo
 * de la operación ("*")
 * Usamos dos override.
 */
public class Multiplicacion extends  Suma{
    /**
     * Calcula el resultado de la multiplicación entre dos números.
     *
     * @param num1 El primer factor de la multiplicación.
     * @param num2 El segundo factor de la multiplicación.
     * @return El resultado de la multiplicación.
     */
    @Override
    public double calcular(double num1, double num2) {

        double resultado = 0;
        for (int i = 0; i < num1; i++) {
            resultado = super.calcular(resultado, num2);
        }
        return resultado;
    }
    /**
     * Obtiene el símbolo representativo de la operación .
     *
     * @return Cadena de texto que representa el símbolo de la multiplicación, que es el signo "*".
     */

    @Override
    public String getSimbolo() {
        return "*";
    }
}
