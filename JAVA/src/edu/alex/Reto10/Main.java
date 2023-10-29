package edu.alex.Reto10;

import edu.alex.Reto10.Process.*;

import java.util.ArrayList;
/**
 * Clase principal que contiene el método main para realizar operaciones aritméticas y mostrar los resultados de estos.
 */
public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        /**
         *  Lista para almacenar los resultados de las operaciones
         */

        ArrayList<Resultado> resultados = new ArrayList<>();
        /**
         *  Instanciación de objetos que representan diferentes operaciones aritméticas
         */

        OperacionesAritmeticas suma = new Suma();
        OperacionesAritmeticas resta = new Resta();
        OperacionesAritmeticas multiplicacion = new Multiplicacion();
        OperacionesAritmeticas division = new Division();
        OperacionesAritmeticas modulo = new Modulo();
        OperacionesAritmeticas potencia = new Potencia();
        OperacionesAritmeticas logaritmico = new Logaritmo();
        OperacionesAritmeticas raiz = new RaizCuadrada();
        /**
         * Creación de objetos Resultado y almacenamiento en la lista de resultados
         */

        resultados.add(new Resultado(suma, num1, num2));
        resultados.add(new Resultado(multiplicacion, num1, num2));
        resultados.add(new Resultado(potencia, num1, num2));
        resultados.add(new Resultado(resta, num1, num2));
        resultados.add(new Resultado(division, num1, num2));
        resultados.add(new Resultado(modulo, num1, num2));
        resultados.add(new Resultado(logaritmico, num1, num2));
        resultados.add(new Resultado(raiz, num1, num2));

        /**
         * Imprime los resultados en la consola usando un for
         */

        for (Resultado resultado : resultados) {
            System.out.println(resultado.getOperacion());
        }
    }

    }

