package edu.alex.reto2.piramide.ui;

import edu.alex.reto2.piramide.process.Pyramid;

import java.util.Scanner;

public class CLI {
    public static void showMenu()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la piramide: ");
        int tamaño= scanner.nextInt();
        Pyramid.Pyramid(tamaño);
    }
}
