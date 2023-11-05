package edu.alex.reto11.Calculator;
/**
 * La clase `Logaritmo` es una subclase de `Division` que calcula el logaritmo
 * de un número utilizando una serie de Taylor.
 */
public class Logaritmo  extends Division{
    /**
     * Calcula el logaritmo de un número utilizando una serie de Taylor.
     *
     * @param num1 El número al que se le calculará el logaritmo (base).
     * @param num2 El número al que se le calculará el logaritmo (exponente).
     * @return El resultado del cálculo del logaritmo.
     */
    @Override
    public double calcular(double num1, double num2) {
        if (num1 > 0 && num2 > 0) {
            double resultado = 1.0;
            double base = num1;
            double exponente = num2;
            double precision = 1e-15; // Valor de precisión
            int maxIteraciones = 100; // Máximo número de iteraciones
            int iteraciones = 0;

            while (iteraciones < maxIteraciones) {
                double termino = 1.0;
                for (int i = 1; i <= iteraciones; i++) {
                    termino *= (exponente - i + 1) / i;
                }
                resultado += termino;

                if (termino < precision) {
                    break;
                }

                iteraciones++;
            }

            return resultado;
        } else {
            System.out.println("Error: Logaritmo indefinido");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo que representa la operación de logaritmo.
     *
     * @return El símbolo "log".
     */
    @Override
    public String getSimbolo() {
        return "log";
    }
}
