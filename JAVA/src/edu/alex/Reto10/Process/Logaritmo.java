package edu.alex.Reto10.Process;
/**
 * La clase Logaritmo extiende la clase Division y representa una operación de logaritmo entre dos números.
 * Esta clase proporciona la funcionalidad para calcular el resultado del logaritmo y obtener el símbolo
 * de la operación ("log").
 */
public class Logaritmo  extends Division{
    /**
     * Calcula el resultado del logaritmo de un número en una base dada.
     *
     * @param num1 El número sobre el cual se calculará el logaritmo.
     * @param num2 La base del logaritmo.
     * @return El resultado del logaritmo.
     */
    @Override
    public double calcular(double num1, double num2) {
        if (num1 > 0 && num2 > 0) {
            double resultado = super.calcular(num1, num2);
            return Math.log(resultado);
        } else {
            System.out.println("Error: Logaritmo indefinido");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación .
     *
     * @return Cadena de texto que representa el símbolo del logaritmo, que es el signo "log".
     */
    @Override
    public String getSimbolo() {
        return "log";
    }
}
