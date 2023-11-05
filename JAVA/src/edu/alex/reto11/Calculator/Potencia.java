package edu.alex.reto11.Calculator;
/**
 * La clase Potencia extiende la clase Multiplicacion y representa una operación de potenciación.
 * Esta clase proporciona la funcionalidad para calcular la potencia de un número y obtener el símbolo
 * de la operación ("^")
 * Usamos dos Override
 */
public class Potencia extends Multiplicacion{
    /**
     * Calcula el resultado de elevar un número a una potencia dada.
     *
     * @param num1 La base de la potencia.
     * @param num2 El exponente al cual se elevará la base.
     * @return El resultado de la potenciación.
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 1;
        for (int i = 0; i < num2; i++) {
            resultado = super.calcular(resultado,num1);
        }
        return resultado;
    }
    /**
     * Obtiene el símbolo representativo de la operación.
     *
     * @return Cadena de texto que representa el símbolo de la potencia, que es el signo "^".
     */
    @Override
    public String getSimbolo() {
        return "^";
    }

}
