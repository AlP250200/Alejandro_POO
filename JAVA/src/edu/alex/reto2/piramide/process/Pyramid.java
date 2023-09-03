package edu.alex.reto2.piramide.process;

/**
 * Esta es la class Pyramid donde se realiza el proceso de crear la piramide
 * En este caso se uso 4 for para formar la piramide de * como se pide
 */
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

