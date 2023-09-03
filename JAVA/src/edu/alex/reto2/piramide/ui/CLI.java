package edu.alex.reto2.piramide.ui;

import edu.alex.reto2.piramide.process.Pyramid;

import java.util.Scanner;

/**
 * Esta class es la que se usa para interactuar con el usuario
 * Aqui se pide el tamaño de la piramide
 * Ya con el tamaño se usa el class Pyramid para generar la piramide
 */
public class CLI {
    public static void showMenu()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la piramide: ");
        int tamaño= scanner.nextInt();
        Pyramid.Pyramid(tamaño);
    }
}
