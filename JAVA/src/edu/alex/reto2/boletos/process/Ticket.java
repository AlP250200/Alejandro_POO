package edu.alex.reto2.boletos.process;

import edu.alex.reto2.boletos.ui.CLI;

/**
 * En esta clase esta el proceso del tickect usando un switch  a su vez este class se usa en el CLI
 * Para que se muestre el precio del boleto seleccinado
 */
public class Ticket {
    public static void Ticket(char tipo) {
        int Adulto = 100;
        int Niño = 70;
        int SININAPAM = 70;
        int INAPAM = 50;
        switch (tipo) {
            case 'A':
                System.out.println("El boleto tiene un valor de " + Adulto);
                break;
            case 'N':
                System.out.println("El boleto tiene un valor de " + Niño);
                break;
            case 'I':
                System.out.println("El boleto tiene un valor de " + INAPAM);
                break;
            case 'B':
                System.out.println("El boleto tiene un valor de " + SININAPAM);
                break;
            default:
                System.out.println("Tipo de boleto no válido.");
        }
    }
}