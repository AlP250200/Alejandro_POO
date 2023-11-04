package edu.alex.Reto10.Process;
/**
 * Clase que representa la operación de suma.
 * Extiende la clase base OperacionesAritmeticas.
 */
public class Suma extends OperacionesAritmeticas{
    /**
     * Realiza una operación de suma entre dos números usando un override.
     *
     * @param num1 Primer número de la suma.
     * @param num2 Segundo número de la suma.
     * @return El resultado de la suma de los números.
     */
    @Override
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * Obtiene el símbolo representativo de la operación de suma usando un override.
     *
     * @return El símbolo "+" que representa la operación de suma.
     */
    @Override
    public String getSimbolo() {
        return "+";
    }

}
