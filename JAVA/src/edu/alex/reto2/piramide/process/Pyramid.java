package edu.alex.reto2.piramide.process;

public class Pyramid {
    public static void Pyramid(int tamaño)
    {
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = tamaño; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

