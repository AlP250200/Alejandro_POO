package edu.alex.reto12.Calculator;
/**
 * La clase RaizCuadrada extiende la clase Potencia y proporciona una implementación para calcular la raíz cuadrada de un número.
 */
public class RaizCuadrada extends Potencia{
    /**
     * Calcula la raíz cuadrada de un número utilizando un enfoque iterativo.
     *
     * @param num1 El número del cual se desea calcular la raíz cuadrada.
     * @param num2 El parámetro adicional que se utiliza en el cálculo (no está claro su propósito).
     * @return La raíz cuadrada del número num1.
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0;
        double base =1;
        while (true)
        {
            resultado=super.calcular(base,num2);
            if(resultado>num1){
                base --;
                break;
            }
            base ++;
        }

        return base;
    }
    /**
     * Obtiene el símbolo asociado a la operación de raíz cuadrada.
     *
     * @return El símbolo "sqrt" que representa la raíz cuadrada.
     */

    @Override
    public String getSimbolo() {
        return "sqrt";
    }

}
