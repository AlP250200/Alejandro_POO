package edu.alex.Reto10.Process;

public class RaizCuadrada extends Multiplicacion{
    /**
     * Calcula una aproximación de la raíz cuadrada de un número utilizando un enfoque iterativo.
     *
     * @param num1 El número del cual se desea calcular la raíz cuadrada.
     * @param num2 Número de iteraciones para refinar la aproximación.
     * @return La aproximación de la raíz cuadrada del número.
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0.5;
        for (int i = 0; i < num2; i++) {
            resultado = super.calcular(resultado,num2);
        }
        return resultado;
    }
    /**
     * Obtiene el símbolo representativo de la operación.
     *
     * @return Cadena de texto que representa el símbolo de la raíz cuadrada, que es "sqrt".
     */
    @Override
    public String getSimbolo() {
        return "sqrt";
    }
}
