package edu.alex.reto4.ui;
import static edu.alex.reto4.process.GeneradorReporte.*;

/**
 *En esta clase esta contiene el arreglo que se mostrará en pantalla ademas de llamar
 * Los distintos metodos de la clase  @GeneradorReporte para darle el reporte de ventas
 * el arreglo pre-cargado es uno bidimensional 
 */
public class CLI {
    public static void showmenu(){

            String[] sabores = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
            int[][] ventas = new int[][]{
                    {111, 483, 471, 427},
                    {192, 500, 355, 158},
                    {289, 470, 474, 160},
                    {415, 114, 161, 308},
            };
            getSaborMasProductivo(ventas);
            getTrimestral(ventas);
            sumaColumnas(ventas);
            for (int i = 0; i < ventas.length; i++) {

            }
        }

    }


