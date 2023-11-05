package edu.alex.reto11.Calculator;

/**
 * Clase que representa la operación de la resta
 * Extiende la clase base OperacionesAritmeticas
 * Usamos dos Override
 */
public class Resta extends OperacionesAritmeticas{
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Obtiene el símbolo representativo de la operación de resta.
     *
     * @return Cadena de texto que representa el símbolo de la resta, que es el signo "-".
     */
    @Override
    public String getSimbolo() {
        return "-";
    }
}
